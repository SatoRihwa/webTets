package sample;

public class Sample {
	
	/** �v�Z�l�ۑ��p */
	private int num = 0;
	
	public Sample(int i) {
		setNum(i);
	}
	
	/**
	 * �e�X�g�p���\�b�h.
	 * @return �`�F�b�N����
	 */
	public String test() {
		return checkNum();
	}
	
	/**
	 * �`�F�b�N����
	 * @return �`�F�b�N����
	 */
	private String checkNum() {
		if(getNum() < 0) {
			return "�}�C�i�X";
		}else if(0 == getNum()){
			return "�[��";
		}else if(getNum() < 10) {
			return "�P��";
		}else {
			return "�Q���ȏ�";
		}
	}

	/**
	 * �l�擾
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * �l�ݒ�
	 * @param num �l
	 */
	public void setNum(int num) {
		this.num = num;
	}
}