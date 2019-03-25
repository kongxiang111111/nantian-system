package cn.com.nantian.util;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @Description:
 * @Author：Fly
 * @Date: 2019/3/22 16:18
 * @Version：1.0
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class AAA {
    private Integer priceId;
    private String custType;
    private Double leavePrice;
    private Date projectBegdate;
}
