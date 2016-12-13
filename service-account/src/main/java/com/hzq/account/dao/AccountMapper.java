package com.hzq.account.dao;

import com.hzq.account.entity.Account;
import com.hzq.base.dao.Dao;

import java.math.BigDecimal;

public interface AccountMapper extends Dao<Account,Integer>{

    Account getAccountByMerchantId(Integer merchantId);

    int addAmountByMerchantId(Integer merchantId, BigDecimal amount);
}