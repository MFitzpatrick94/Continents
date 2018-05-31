package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product
{
    @Id
    private int productId;

    private String productName;
    private BigDecimal unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;

    public int getProductId()
    {
        return productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public BigDecimal getUnitPrice()
    {
        return unitPrice;
    }

    public int getUnitsInStock()
    {
        return unitsInStock;
    }

    public int getUnitsOnOrder()
    {
        return unitsOnOrder;
    }

    public int getReorderLevel()
    {
        return reorderLevel;
    }
}
