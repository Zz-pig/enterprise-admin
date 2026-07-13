package com.mycompany.admin.common.exception.user;

import com.mycompany.admin.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author yangzhenzhu
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
