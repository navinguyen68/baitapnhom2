package type;

public enum SubjectType { //dai cuong , co so nganh / chuyen nganh
    DC("Đại Cương"),
    CSN("Cơ sở ngành"),
    CN("Chuyên ngành");
    public String value;
    SubjectType(String value) {
        this.value = value;
    }
}
