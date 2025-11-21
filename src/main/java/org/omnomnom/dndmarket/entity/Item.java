package org.omnomnom.dndmarket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "item", schema = "dbo")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemID", nullable = false)
    private Long id;

    @Size(max = 150)
    @Nationalized
    @Column(name = "itemName", length = 150)
    private String itemName;

    @Size(max = 20)
    @Nationalized
    @Column(name = "itemRarity", length = 20)
    private String itemRarity;

    @Column(name = "itemCost")
    private Integer itemCost;

    @Size(max = 20)
    @Nationalized
    @Column(name = "itemType", length = 20)
    private String itemType;

    @Size(max = 150)
    @Nationalized
    @Column(name = "itemRestrictions", length = 150)
    private String itemRestrictions;

    @Size(max = 20)
    @Nationalized
    @Column(name = "itemAttunement", length = 20)
    private String itemAttunement;

    @Size(max = 150)
    @Nationalized
    @Column(name = "itemSource", length = 150)
    private String itemSource;

    @Size(max = 200)
    @Nationalized
    @Column(name = "itemUrl", length = 200)
    private String itemUrl;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "itemVisualDesc", length = 1000)
    private String itemVisualDesc;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "itemShopkeeperDesc", length = 1000)
    private String itemShopkeeperDesc;

    @Column(name = "itemSelected")
    private Boolean itemSelected;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemRarity() {
        return itemRarity;
    }

    public void setItemRarity(String itemRarity) {
        this.itemRarity = itemRarity;
    }

    public Integer getItemCost() {
        return itemCost;
    }

    public void setItemCost(Integer itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemRestrictions() {
        return itemRestrictions;
    }

    public void setItemRestrictions(String itemRestrictions) {
        this.itemRestrictions = itemRestrictions;
    }

    public String getItemAttunement() {
        return itemAttunement;
    }

    public void setItemAttunement(String itemAttunement) {
        this.itemAttunement = itemAttunement;
    }

    public String getItemSource() {
        return itemSource;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getItemVisualDesc() {
        return itemVisualDesc;
    }

    public void setItemVisualDesc(String itemVisualDesc) {
        this.itemVisualDesc = itemVisualDesc;
    }

    public String getItemShopkeeperDesc() {
        return itemShopkeeperDesc;
    }

    public void setItemShopkeeperDesc(String itemShopkeeperDesc) {
        this.itemShopkeeperDesc = itemShopkeeperDesc;
    }

    public Boolean getItemSelected() {
        return itemSelected;
    }

    public void setItemSelected(Boolean itemSelected) {
        this.itemSelected = itemSelected;
    }

}
