/*
 * Copyright (c) 2013 Honyee Industry Group Co., Ltd
 * www.honyee.biz
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Honyee Industry Group Co., Ltd ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with Honyee Industry Group Co., Ltd.
 */
package cc.wdcy.web.context;

import cc.wdcy.domain.shared.security.WdcyUserDetails;
import cc.wdcy.domain.shared.security.SecurityHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author Shengzhao Li
 */
public class SpringSecurityHolder implements SecurityHolder {

    @Override
    public WdcyUserDetails userDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return null;
        }
        Object principal = authentication.getPrincipal();
        if (principal instanceof WdcyUserDetails) {
            return (WdcyUserDetails) principal;
        }
        return null;
    }
}