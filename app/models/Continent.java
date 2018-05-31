package models;

public class Continent
{
    private String id;
    private String name;
    private int aquareKilometers;
    private long population;

    public Continent(String id, String name, int squareKilometers, long population)
    {
        this.id = id;
        this.aquareKilometers = squareKilometers;
        this.name = name;
        this.population= population;

    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getSquareKilometers()
    {
        return aquareKilometers;
    }

    public long getPopulation()
    {
        return population;
    }
}
