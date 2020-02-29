package com.cts.project.Second;
import com.cts.project.Second.Stock;


public interface StockBo {
	
		void save(Stock stock);
		void update(Stock stock);
		void delete(Stock stock);
		Stock findByStockCode(String stockCode);


	}

