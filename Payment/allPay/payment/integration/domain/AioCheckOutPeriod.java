package allPay.payment.integration.domain;

/**
 * ���ͫH�Υd�w���w�B�q�檫��
 * @author mark.chiu
 *
 */
public class AioCheckOutPeriod {
	
	/**
	 * MerchantID
	 * �|���s��(��allPay����)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * �|������s���A�ӥ���s�����i����
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * StoreID
	 * �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 */
	private String StoreID = "";
	
	/**
	 * MerchantTradeDate
	 * �|������ɶ�
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * �������
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * ������B
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * ����y�z
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * �ӫ~�W��
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * �I�ڧ����q���^�Ǻ��}
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * ��ܹw�]�I�ڤ覡
	 */
	private String ChoosePayment = "Credit";
	
	/**
	 * ClientBackURL
	 * Client�ݪ�^�|���t�Ϊ����s�s��
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * �ӫ~�P����}
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * �Ƶ����
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * ��ܹw�]�I�ڤl����
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client�ݦ^�ǥI�ڵ��G���}
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * �O�_�ݭn�B�~���I�ڸ�T
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * �˸m�ӷ��A�бa�ŭȡA��allPay�۰ʧP�w�C
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * ���åI�ڤ覡�A�]�w�ɦ۰ʱa�J
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * �S���X�@���x�ӥN��(��allPay����)�A�]�w�ɦ۰ʱa�J
	 */
	private String PlatformID = "";
	
	/**
	 * InvoiceMark
	 * �q�l�o���}�ߵ��O�A�{���۰ʧP�_
	 */
	private String InvoiceMark = "";
	
	/**
	 * HoldTradeAMT
	 * �O�_���𼷴�
	 */
	private String HoldTradeAMT = "";
	
	/**
	 * EncryptType
	 * CheckMacValue�[�K����
	 */
	private String EncryptType = "1";
	
	/**
	 * UseRedeem
	 * �O�_�i�H�ϥ��ʪ���/���]���
	 */
	private String UseRedeem = "";
	
	/**
	 * PeriodAmount
	 * �C�����v���B
	 */
	private String PeriodAmount = "";
	
	/**
	 * PeriodType
	 * �g������
	 */
	private String PeriodType = "";
	
	/**
	 * Frequency
	 * �����W�v
	 */
	private String Frequency = "";
	
	/**
	 * ExecTimes
	 * ���榸��
	 */
	private String ExecTimes = "";
	
	/**
	 * PeriodReturnURL
	 * �w���w�B�����浲�G�^��URL
	 */
	private String PeriodReturnURL = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���oMerchantID �|���s��(��O'Pay����)�A�������x���S���X�@���x���إ߭q��ɡA�����~���ġC�@�륭�x�ӽЩ��������
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * �]�wMerchantID �|���s��(��O'Pay����)�A�������x���S���X�@���x���إ߭q��ɡA�����~���ġC�@�륭�x�ӽЩ��������
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���oMerchantTradeNo �|������s���A�^�Ʀr�j�p�g�V�X�A�ӥ���s�����i���ơA�p���ϥ�PlatformID�A���x�ө��U�Ҧ��Ӯa���q��s���礣�i���ơC
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * �]�wMerchantTradeNo �|������s���A�^�Ʀr�j�p�g�V�X�A�ӥ���s�����i���ơA�p���ϥ�PlatformID�A���x�ө��U�Ҧ��Ӯa���q��s���礣�i���ơC
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * ���oMerchantTradeDate �|������ɶ�
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * �]�wMerchantTradeDate �|������ɶ��A�ХH yyyy/MM/dd HH:mm:ss�榡�a�J
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * ���oPaymentType �������
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * �]�wPaymentType �������
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * ���oTotalAmount ������B�A�бa��ơA���i���p���I
	 * ���B���i��0��
	 * CVS�̧C���27���A�̰����20000��
	 * �H�Υd���B�Y�D�S���|���βĤT���ӤH/�Ӱ��p��(ĳ��)�A���B���i�p��5��
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * �]�wTotalAmount ������B�A�бa��ơA���i���p���I
	 * ���B���i��0��
	 * CVS�̧C���27���A�̰����20000��
	 * �H�Υd���B�Y�D�S���|���βĤT���ӤH/�Ӱ��p��(ĳ��)�A���B���i�p��5��
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * ���oTradeDesc ����y�z
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * �]�wTradeDesc ����y�z
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * ���oItemName �ӫ~�W�١A�Y���h���A�ݦb���y��ܭ� �@��@����ܰӫ~�W�٪��ܡA�ӫ~�W�ٽХH�Ÿ�#���j�C
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * �]�wItemName �ӫ~�W�١A�Y���h���A�ݦb���y��ܭ� �@��@����ܰӫ~�W�٪��ܡA�ӫ~�W�ٽХH�Ÿ�#���j�C
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * ���oReturnURL �I�ڧ����q���^�Ǻ��}�A�����O�̥I�ڧ�����A�ڥI�_�|�N�I�� ���G�ѼƥH����(Server POST)�^�Ǩ� �Ӻ��}�C
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * �]�wReturnURL �I�ڧ����q���^�Ǻ��}�A�����O�̥I�ڧ�����A�ڥI�_�|�N�I�� ���G�ѼƥH����(Server POST)�^�Ǩ� �Ӻ��}�C
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * ���oChoosePayment ��ܹw�]�I�ڤ覡
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * �]�wChoosePayment ��ܹw�]�I�ڤ覡
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * ���oClientBackURL Client�ݪ�^�|���t�Ϊ����s�s���C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * �]�wClientBackURL Client�ݪ�^�|���t�Ϊ����s�s���C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * ���oItemURL �ӫ~�P����}�C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * �]�w ItemURL �ӫ~�P����}�C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	/**
	 * ���oRemark �Ƶ����
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * �]�wRemark �Ƶ����
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * ���oChooseSubPayment ��ܹw�]�I�ڤl���ءC�Y�]�w���ѼơA�ϥΪ̫h�L�k�ݨ����y ��ܭ��A�B�ϥΪ̥����n�w�n�J�ڥI�_�C
	 *  �Ҧp�G�I�ڤ覡[ChoosePayment]�]�w WebATM�A�I�ڤl���� [ChooseSubPayment]�]�w TAISHIN�A
	 *  ��������ȷ|�H�x�s�Ȧ檺 ���� ATM �I�ڡC�аѦҥI�ڤ覡�@����
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * �]�wChooseSubPayment ��ܹw�]�I�ڤl���ءC�Y�]�w���ѼơA�ϥΪ̫h�L�k�ݨ����y ��ܭ��A�B�ϥΪ̥����n�w�n�J�ڥI�_�C
	 *  �Ҧp�G�I�ڤ覡[ChoosePayment]�]�w WebATM�A�I�ڤl���� [ChooseSubPayment]�]�w TAISHIN�A
	 *  ��������ȷ|�H�x�s�Ȧ檺 ���� ATM �I�ڡC�аѦҥI�ڤ覡�@����
	 * @param chooseSubPayment
	 */
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	/**
	 * ���oOrderResultURL Client�ݦ^�ǥI�ڵ��G���}�C�I�ڧ�����A�ڥI�_�N�����ɦ^��| �����}�A�ñN�I�ڵ��G�a�^ 
	 * �`�N�ƶ��G
	 * 1.	�S�a���Ѽƫh�|��ܼڥI�_���I �ڧ������C
	 * 2.	�p�G�n�N�I�ڵ��G����ܦb�|�� �t�Τ��A�г]�w���ѼơC
	 * 3.	�Y�]�w���ѼơA�N�|�ϳ]�w�� Client �ݪ�^�|���t�Ϊ����s�s ��[ClientBackURL]���ġC
	 * 4.	�����Ȧ� WebATM �b������\ ��,�|���d�b�Ȧ檺����,�ä��|�� �^���ڥI�_,�ҥH�ڥI�_�]���|�N �����ɦ^��[OrderResultURL]������
	 * 5.	�]�I�q�M�D�ήɥ��(ATM�BCVS) ���䴩���ѼơC
	 * 6.	��ĳ�b���ն��q�ɥ����n�]�w�� �ѼơA�i�N�e�����d�b�ڥI�_�A�� ���ڥI�_�Ҵ��Ѫ����~�T���A�K�i �H���İ����C
	 * 7.	�Y���]�w���ѼơA�аȥ��ھڦ^�� ��������A�ӧP�_��ܥI�ڦ��\ �P�_�������C
	 * 8.	�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * �]�wOrderResultURL Client�ݦ^�ǥI�ڵ��G���}�C�I�ڧ�����A�ڥI�_�N�����ɦ^��| �����}�A�ñN�I�ڵ��G�a�^ 
	 * �`�N�ƶ��G
	 * 1.	�S�a���Ѽƫh�|��ܼڥI�_���I �ڧ������C
	 * 2.	�p�G�n�N�I�ڵ��G����ܦb�|�� �t�Τ��A�г]�w���ѼơC
	 * 3.	�Y�]�w���ѼơA�N�|�ϳ]�w�� Client �ݪ�^�|���t�Ϊ����s�s ��[ClientBackURL]���ġC
	 * 4.	�����Ȧ� WebATM �b������\ ��,�|���d�b�Ȧ檺����,�ä��|�� �^���ڥI�_,�ҥH�ڥI�_�]���|�N �����ɦ^��[OrderResultURL]������
	 * 5.	�]�I�q�M�D�ήɥ��(ATM�BCVS) ���䴩���ѼơC
	 * 6.	��ĳ�b���ն��q�ɥ����n�]�w�� �ѼơA�i�N�e�����d�b�ڥI�_�A�� ���ڥI�_�Ҵ��Ѫ����~�T���A�K�i �H���İ����C
	 * 7.	�Y���]�w���ѼơA�аȥ��ھڦ^�� ��������A�ӧP�_��ܥI�ڦ��\ �P�_�������C
	 * 8.	�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * ���oNeedExtraPaidInfo �O�_�ݭn�B�~���I�ڸ�T  �C�^�ǧ�ԲӪ��I�ڸ�T��ReturnURL�Ѽƫ��w��URL�C�w�]��N�C
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * �]�wNeedExtraPaidInfo �O�_�ݭn�B�~���I�ڸ�T  �C�^�ǧ�ԲӪ��I�ڸ�T��ReturnURL�Ѽƫ��w��URL�C�w�]��N�C
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * ���oDeviceSource �˸m�ӷ�
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * �]�wDeviceSource �˸m�ӷ�
	 * @param deviceSource
	 */
//	public void setDeviceSource(String deviceSource) {
//		DeviceSource = deviceSource;
//	}
	/**
	 * ���oIgnorePayment ���åI�ڤ覡
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * �]�wIgnorePayment ���åI�ڤ覡
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	/**
	 * ���oPlatformID �S���X�@���x�ӥN��(��O��Pay����)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * �]�wPlatformID �S���X�@���x�ӥN��(��O��Pay����)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * ���oInvoiceMark �q�l�o���}�ߵ��O
	 * @return InvoiceMark
	 */
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	/**
	 * �]�wInvoiceMark �q�l�o���}�ߵ��O
	 * @param invoiceMark
	 */
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	/**
	 * ���oHoldTradeAMT �O�_���𼷴�
	 * 1. �Y�������𼷴ڡA�бa�G0�A�R��I�ڧ�����A�ڥI�_�̦X�����w���ɶ��A���ڵ��|�� 
	 * 2. �Y�����𼷴ڡA�бa�G1�A�R��I �ڧ�����A�ݦA�I�s�u�|���ӽм� �ڰh�ڡvAPI�A���ڥI�_���ڵ��| ���A�ΰh�ڵ��R��C
	 * �`�N�ƶ��G ���խY�|���@�����ӽм��ڡA�����q�� �ڶ��|�@����b�ڥI�_�A����|���ӽ� ���ڡC
	 * 		       �����𼷴ڤ��A�Ρu�H�Υd�v�B�u�]�I�q�v ���I�ڤ覡�C
	 * @return HoldTradeAMT
	 */
	public String getHoldTradeAMT() {
		return HoldTradeAMT;
	}
	/**
	 * �]�wHoldTradeAMT �O�_���𼷴�
	 * 1. �Y�������𼷴ڡA�бa�G0�A�R��I�ڧ�����A�ڥI�_�̦X�����w���ɶ��A���ڵ��|�� 
	 * 2. �Y�����𼷴ڡA�бa�G1�A�R��I �ڧ�����A�ݦA�I�s�u�|���ӽм� �ڰh�ڡvAPI�A���ڥI�_���ڵ��| ���A�ΰh�ڵ��R��C
	 * �`�N�ƶ��G ���խY�|���@�����ӽм��ڡA�����q�� �ڶ��|�@����b�ڥI�_�A����|���ӽ� ���ڡC
	 * 		       �����𼷴ڤ��A�Ρu�H�Υd�v�B�u�]�I�q�v ���I�ڤ覡�C
	 * @param holdTradeAMT
	 */
	public void setHoldTradeAMT(String holdTradeAMT) {
		HoldTradeAMT = holdTradeAMT;
	}
	/**
	 * ���oEncryptType CheckMacValue�[�K����
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * �]�wEncryptType CheckMacValue�[�K����
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * ���oUseRedeem �O�_�i�H�ϥ��ʪ���/���]���C�Ψӳ]�w��������O�_�i�H�ϥ��ʪ� ��/���]���C 
	 * 1. �Y���i�ϥήɡA�бa�G��
	 * 2. �Y�����i�ϥήɡA�бa�GN
	 * �`�N�ƶ��G 
	 * 1. ���覡�i��u�t�ӫ�x�����]�� ��]�w�v�\��s�W�z��������A �Y�w�}�ҧ��]�w�A�ݦA�t�X���� �ơA�ӨM�w��������O�_�i�H�ϥ� �ʪ���/���]���C 
	 * 2. �t�X����ʪ���/���]�|���A�ڥI �_�N��U�i��K�O�n���A��褧�� �B�A�h�ѷ|���t��C 
	 * 3. �Y�i�ϥ��ʪ���/���]���ɡA�� �`�N�����I�ڵ��G�q���ɡA�ХH�� �����B[TradeAmt]���q����B���ˬd�C
	 * @return UseRedeem
	 */
	public String getUseRedeem() {
		return UseRedeem;
	}
	/**
	 * �]�wUseRedeem �O�_�i�H�ϥ��ʪ���/���]���C�Ψӳ]�w��������O�_�i�H�ϥ��ʪ� ��/���]���C 
	 * 1. �Y���i�ϥήɡA�бa�G��
	 * 2. �Y�����i�ϥήɡA�бa�GN
	 * �`�N�ƶ��G 
	 * 1. ���覡�i��u�t�ӫ�x�����]�� ��]�w�v�\��s�W�z��������A �Y�w�}�ҧ��]�w�A�ݦA�t�X���� �ơA�ӨM�w��������O�_�i�H�ϥ� �ʪ���/���]���C 
	 * 2. �t�X����ʪ���/���]�|���A�ڥI �_�N��U�i��K�O�n���A��褧�� �B�A�h�ѷ|���t��C 
	 * 3. �Y�i�ϥ��ʪ���/���]���ɡA�� �`�N�����I�ڵ��G�q���ɡA�ХH�� �����B[TradeAmt]���q����B���ˬd�C
	 * @param useRedeem
	 */
	public void setUseRedeem(String useRedeem) {
		UseRedeem = useRedeem;
	}
	/**
	 * ���oPeriodAmount �C�����v���B
	 * �`�N�ƶ��G �ڥI�_�|�̦������v���B[PeriodAmount]�ҳ]�w�����B��������T�w���v�����B�C 
	 * ������B[TotalAmount]�]�w���B�����M���v���B[PeriodAmount]�ۦP�C
	 * �бa��ơA���i���p���I�C�ȭ��s�x���C
	 * @return PeriodAmount
	 */
	public String getPeriodAmount() {
		return PeriodAmount;
	}
	/**
	 * �]�wPeriodAmount �C�����v���B
	 * �`�N�ƶ��G �ڥI�_�|�̦������v���B[PeriodAmount]�ҳ]�w�����B��������T�w���v�����B�C 
	 * ������B[TotalAmount]�]�w���B�����M���v���B[PeriodAmount]�ۦP�C
	 * �бa��ơA���i���p���I�C�ȭ��s�x���C
	 * @param periodAmount
	 */
	public void setPeriodAmount(String periodAmount) {
		PeriodAmount = periodAmount;
	}
	/**
	 * ���oPeriodType �g������ D�G�H�Ѭ��g���AM�G�H�묰�g���AY�G�H�~���g��
	 * @return PeriodType
	 */
	public String getPeriodType() {
		return PeriodType;
	}
	/**
	 * �]�wPeriodType �g������ D�G�H�Ѭ��g���AM�G�H�묰�g���AY�G�H�~���g��
	 * @param periodType
	 */
	public void setPeriodType(String periodType) {
		PeriodType = periodType;
	}
	/**
	 * ���oFrequency �����W�v�A���ѼƥΨөw�q�h�[�n����@��
	 * �`�N�ƶ��G 
	 * 1. �ܤ֭n�j�󵥩�1���H�W�C 
	 * 2. ��PeriodType�]��D�ɡA�̦h�i�]365���C 
	 * 3. ��PeriodType�]��M�ɡA�̦h�i�]12���C 
	 * 4. ��PeriodType�]��Y�ɡA�̦h�i�]1���C
	 * @return Frequency
	 */
	public String getFrequency() {
		return Frequency;
	}
	/**
	 * �]�wFrequency �����W�v�A���ѼƥΨөw�q�h�[�n����@��
	 * �`�N�ƶ��G 
	 * 1. �ܤ֭n�j�󵥩�1���H�W�C 
	 * 2. ��PeriodType�]��D�ɡA�̦h�i�]365���C 
	 * 3. ��PeriodType�]��M�ɡA�̦h�i�]12���C 
	 * 4. ��PeriodType�]��Y�ɡA�̦h�i�]1���C
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	/**
	 * ���oExecTimes ���榸�ơA�`�@�n����X���C
	 * @return ExecTimes
	 */
	public String getExecTimes() {
		return ExecTimes;
	}
	/**
	 * �]�wExecTimes ���榸�ơA�`�@�n����X���C
	 * @param execTimes
	 */
	public void setExecTimes(String execTimes) {
		ExecTimes = execTimes;
	}
	/**
	 * ���oPeriodReturnURL �w���w�B�����浲�G�^��URL�A�Y����O�H�Υd�w���w�B���覡�A�h�C��������v���A�|�N���v���G�^�Ǩ�o�ӳ]�w��URL�C
	 * @return PeriodReturnURL
	 */
	public String getPeriodReturnURL() {
		return PeriodReturnURL;
	}
	/**
	 * �]�wPeriodReturnURL �w���w�B�����浲�G�^��URL�A�Y����O�H�Υd�w���w�B���覡�A�h�C��������v���A�|�N���v���G�^�Ǩ�o�ӳ]�w��URL�C
	 * @param periodReturnURL
	 */
	public void setPeriodReturnURL(String periodReturnURL) {
		PeriodReturnURL = periodReturnURL;
	}
	/**
	 * ���oStoreID �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * �]�wStoreID �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	@Override
	public String toString() {
		return "AioCheckOutPeriod [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", StoreID="
				+ StoreID + ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType
				+ ", TotalAmount=" + TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName
				+ ", ReturnURL=" + ReturnURL + ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL
				+ ", ItemURL=" + ItemURL + ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment
				+ ", OrderResultURL=" + OrderResultURL + ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource="
				+ DeviceSource + ", IgnorePayment=" + IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark="
				+ InvoiceMark + ", HoldTradeAMT=" + HoldTradeAMT + ", EncryptType=" + EncryptType + ", UseRedeem="
				+ UseRedeem + ", PeriodAmount=" + PeriodAmount + ", PeriodType=" + PeriodType + ", Frequency="
				+ Frequency + ", ExecTimes=" + ExecTimes + ", PeriodReturnURL=" + PeriodReturnURL + "]";
	}
}