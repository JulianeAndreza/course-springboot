package com.fixproject.course.entities.enums;

public enum OrderStatus {
//Se acrescentrar entre, pode quebrar a ordem
    //Colocar os valores
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

//Acrescentou valor, precisa de construtor

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    //criar metodo publico para o acesso

    public int getCode() {
        return code;
    }

    //metodo estatico -conv pra enum

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }


}
