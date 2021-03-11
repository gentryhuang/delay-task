package com.caisl.dt.common.constant;

/**
 *
 *
 * @author caisl
 * @since 2021/3/02
 */
public enum DelayTaskStatusEnum {
    INIT(1, "初始化"),
    SEND(2, "消息已发放"),
    SUCCESS(3, "业务处理成功"),
    FAIL(4, "业务处理失败"),
    CANCEL(5, "业务取消");

    private Integer status;
    private String desc;

    DelayTaskStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static DelayTaskStatusEnum getByStatus(Integer status) {
        for (DelayTaskStatusEnum taskStatusEnums : values()) {
            if (taskStatusEnums.getStatus().equals(status)) {
                return taskStatusEnums;
            }
        }
        return null;
    }

    public Integer getStatus() {
        return status;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
