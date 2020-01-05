package collections.maintaskflowers.flower;

public enum EFlower  {
    ROSE("Роза"),
    TULIP("Тюльпан"),
    LILY("Лилия"),
    VIOLET("Фиалка"),
    ASTRA("Астра"),
    CHRYSANTHEMUM("Хризантема"),
    ORCHID("Орхидея"),
    PION("Пион"),
    OTHER_CATEGORY(null);

    private String flowersName;

    EFlower() {
        flowersName = "null";
    }

    EFlower(String flowersName) {
        this.flowersName = flowersName;
    }

    public String getFlowersName() {
        return flowersName;
    }


}