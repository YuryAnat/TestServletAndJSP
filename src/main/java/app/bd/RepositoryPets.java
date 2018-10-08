package app.bd;

import app.entities.pets.Pet;
import app.entities.pets.SavedPets;

import java.util.List;

public interface RepositoryPets {

        void addPet(Pet pet);
        void updatePet(Pet sPet, int id);
        void deletePet(int id);
        void deleteAllPetsUser(int id_user);
        List<SavedPets> listPets(int id_user);

}
