package app.bd;

import app.entities.pets.Pet;
import app.entities.pets.SavedPets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetRepositoryImpl implements RepositoryPets {
    private final String ADD_PET = "insert into \"pet\".\"pets\" (id_user, kind,name,weight,age) values (?, ?, ?, ?, ?);";
    private final String UPDATE_PET = "update \"pet\".\"pets\" set kind=?, name =? weight=? age=? where id = ?";
    private final String DELETE_PET = "delete from \"pet\".\"pets\" where id = ?";
    private final String DELETE_PETS = "delete from \"pet\".\"pets\" where id_user = ?";
    private final String LIST_PETS = "select * from \"pet\".\"pets\" where id_user = ?";


    @Override
    public void addPet(Pet pet) {
        try(Connection con = new ConnectionPostgresql().getConnection()) {
            PreparedStatement prst = con.prepareStatement(ADD_PET);
            prst.setInt(1, pet.getId_user());
            prst.setString(2,pet.getKind());
            prst.setString(3,pet.getName());
            prst.setDouble(4,pet.getWeight());
            prst.setInt(5,pet.getAge());
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePet(Pet pet, int id) {
        try(Connection con = new ConnectionPostgresql().getConnection()) {
            PreparedStatement prst = con.prepareStatement(UPDATE_PET);
            prst.setString(1, pet.getKind());
            prst.setString(2,pet.getName());
            prst.setDouble(3,pet.getWeight());
            prst.setInt(4,pet.getAge());
            prst.setInt(5,id);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePet(int id) {
        deletePet(id, DELETE_PET);
    }

    @Override
    public void deleteAllPetsUser(int idUser) {
        deletePet(idUser, DELETE_PETS);
    }

    static void deletePet(int idUser, String delete_pets) {
        try(Connection con = new ConnectionPostgresql().getConnection()) {
            PreparedStatement prst = con.prepareStatement(delete_pets);
            prst.setInt(1,idUser);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SavedPets> listPets(int id_user) {
        try (Connection con = new ConnectionPostgresql().getConnection()) {
            PreparedStatement prst = con.prepareStatement(LIST_PETS);
            prst.setInt(1, id_user);
            ResultSet resultSet = prst.executeQuery();
            List<SavedPets> list = new ArrayList();
            while (resultSet.next()) {
                SavedPets savedPets = new SavedPets();
                savedPets.setId(resultSet.getInt("id"));
                savedPets.setId_user(resultSet.getInt("id_user"));
                savedPets.setKind(resultSet.getString("kind"));
                savedPets.setName(resultSet.getString("name"));
                savedPets.setWeight(resultSet.getDouble("weight"));
                savedPets.setId_user(resultSet.getInt("age"));
                list.add(savedPets);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
