package com.tlm.security.rbac.service;

import com.tlm.security.rbac.form.UserForm;
import com.tlm.security.rbac.util.Result;

public interface UserService {
    Result register(UserForm form);

}
