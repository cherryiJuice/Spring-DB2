package hello.itemservice.repository;

import lombok.Data;

@Data
public class ItemSearchCond {

    //검색 조건이 아이템 이름이랑 가격
    private String itemName;
    private Integer maxPrice;

    public ItemSearchCond() {
    }

    public ItemSearchCond(String itemName, Integer maxPrice) {
        this.itemName = itemName;
        this.maxPrice = maxPrice;
    }
}
