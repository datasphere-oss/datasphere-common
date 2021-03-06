/*
 * Copyright 2019, Huahuidata, Inc.
 * DataSphere is licensed under the Mulan PSL v1.
 * You can use this software according to the terms and conditions of the Mulan PSL v1.
 * You may obtain a copy of Mulan PSL v1 at:
 * http://license.coscl.org.cn/MulanPSL
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR
 * PURPOSE.
 * See the Mulan PSL v1 for more details.
 */

package com.datasphere.server.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.datasphere.server.common.exception.GlobalErrorCodes;
import com.datasphere.server.common.exception.DSSException;

/**
 * 访问被拒绝时发生错误（错误处理错误）
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Authentication failed")
public class InvalidTokenException extends DSSException {

  public InvalidTokenException(String message) {
    super(GlobalErrorCodes.INVALID_TOKEN_CODE, message);
  }

  public InvalidTokenException(Throwable cause) {
    super(GlobalErrorCodes.INVALID_TOKEN_CODE, cause);
  }

  public InvalidTokenException(String message, Throwable cause) {
    super(GlobalErrorCodes.INVALID_TOKEN_CODE, message, cause);
  }
}
