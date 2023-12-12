package com.code.rendra.service2.domain.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SampleServiceResponse {
  private String error_code;
  private String error_message;
  private String trx_id;

}
