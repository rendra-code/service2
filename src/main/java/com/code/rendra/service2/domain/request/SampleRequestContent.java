package com.code.rendra.service2.domain.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SampleRequestContent {
  private String service_id;
  private String order_type;
  private String type;
  private String trx_id;
}
