package com.axelor.apps.sale.service.saleorder;

import com.axelor.apps.base.AxelorException;
import com.axelor.apps.sale.db.SaleOrder;
import java.util.Map;

public interface SaleOrderDummyService {
  Map<String, Object> fireDummies(SaleOrder saleOrder);

  Map<String, Object> getDummies(SaleOrder saleOrder) throws AxelorException;
}
