package com.example.monolith.service;

import com.example.monolith.model.service.*;
import com.example.monolith.model.web.response.*;

import javax.validation.Valid;
import java.util.List;

public interface TransactionService {

  TopUpTransactionWebResponse topUp(@Valid TopUpTransactionServiceRequest request);

  PurchaseTransactionWebResponse purchase(@Valid PurchaseTransactionServiceRequest request);

  PointTransactionWebResponse point(@Valid PointTransactionServiceRequest request);

  TransferTransactionWebResponse transfer(@Valid TransferTransactionServiceRequest request);

  List<TransactionWebResponse> list(@Valid ListTransactionServiceRequest request);
}