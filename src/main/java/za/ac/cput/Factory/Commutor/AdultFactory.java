package za.ac.cput.Factory.Commutor;

import za.ac.cput.Domain.CommutorPkg.Adult;

public class AdultFactory
{
    public static Adult getAdult(int age)
    {
        return  new Adult.Builder()
                .age(age)
                .build();
    }
}
