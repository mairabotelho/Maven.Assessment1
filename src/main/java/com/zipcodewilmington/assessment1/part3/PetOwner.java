package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String owner;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name,  Pet... pets) {
        this.owner = name;
        this.pets = pets;
    }


    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets = new Pet[1];
        pets[0] = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int index = 0; index < pets.length; index++)
            if(pets[index].equals(pet))
                pets[index] = null;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet item : pets)
            if(pet == item){
                return true;
            }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        int age = pets[0].getAge();

        for(int index = 0; index < pets.length; index++)
            if(age > pets[index].getAge())
                age = pets[index].getAge();


        return age;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        int age = pets[0].getAge();

        for(int index = 0; index < pets.length; index++)
            if(age < pets[index].getAge())
                age = pets[index].getAge();


        return age;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int ages = 0;

        for(Pet pet : pets)
            ages += pet.getAge();

        return Float.valueOf(ages/pets.length);
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return owner;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
