<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="AllPay.Payment.Integration.*" %>
<%@ page import="java.util.Hashtable" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.TreeSet" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AllPay</title>
</head>
<body>
<%
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */		
		oPayment.ServiceMethod = HttpMethod.HttpPOST;		
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/Cashier/AioCheckOut/V2";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");

		/* 基本參數 */
		String ServerIP = (String) session.getAttribute("ServerIP");
		oPayment.Send.ReturnURL = ServerIP + "/checkOutFeedback_ATM.jsp";
		oPayment.Send.ClientBackURL = ServerIP + "/checkOutFeedback_ATM.jsp";
		oPayment.Send.OrderResultURL = ServerIP + "/checkOutFeedback_ATM.jsp";
		//		
		oPayment.Send.MerchantTradeNo = String.valueOf((new Date()).getTime());
		oPayment.Send.MerchantTradeDate = new Date();
		oPayment.Send.TotalAmount = new Decimal("300");
		oPayment.Send.TradeDesc = "測試";
		oPayment.Send.ChoosePayment = PaymentMethod.TopUpUsed;
		oPayment.Send.Remark = "測試Pay";
		//oPayment.Send.ChooseSubPayment = PaymentMethodItem.;
		oPayment.Send.NeedExtraPaidInfo = ExtraPaymentInfo.Yes;
		oPayment.Send.DeviceSource = DeviceType.PC;
		//oPayment.Send.IgnorePayment = "ATM";
		
		oPayment.SendExtend.ExpireDate = 1;
		oPayment.SendExtend.PaymentInfoURL = ServerIP + "/checkOutFeedback_ATM.jsp";		
		//oPayment.SendExtend.ClientRedirectURL = "http://127.0.0.1:8080/";
		
		// 加入選購商品資料。
		Item a1 = new Item();
		a1.Name = "一棟房子";
		a1.Price = new Decimal("300");
		a1.Currency = "元";
		a1.Quantity = 2;
		a1.URL = "<<產品說明位址>>";
		oPayment.Send.Items.add(a1);
		
		Item a2 = new Item();
		a2.Name = "iPhone 6S";
		a2.Price = new Decimal("400");
		a2.Currency = "元";
		a2.Quantity = 8;
		a2.URL = "<<產品說明位址>>";
		oPayment.Send.Items.add(a2);
		
		enErrors.addAll(oPayment.CheckOut(response.getWriter()));
		
	}
	catch (Exception e) {
		enErrors.add(e.getMessage());
	}
	finally {
		// 回覆錯誤訊息。
	    if (enErrors.size() > 0) {
			if (!enErrors.contains(null)) {	
				out.println("0|" + enErrors + "<br/>");
		    } else {
				out.println("0|" + "無回傳值(遠端服務無法回傳到測試網站, 請檢查測試的網路環境)" + "<br/>");
			}
            out.println("<br/>");
		}
	}
%>

<form action="<%=session.getAttribute("ServerIP")%>" method="post">
	<input type="button" value="回到Allpay金流測試首頁" onClick="submit()">	
</form>

</body>
</html>