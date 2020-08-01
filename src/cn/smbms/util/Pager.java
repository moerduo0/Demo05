package cn.smbms.util;

import java.util.List;

/**
 * ���Ϸ�ҳ
 * 
 * @author Cc.liu
 *
 */
public class Pager<T> {
	// ��Ҫ��ҳ�ļ���
	private List<T> list;
	// ��ʾ���ܼ�¼��
	private Integer totalNum;
	// ��ҳ��
	private Integer totalPage;
	// ��ǰҳ
	private Integer currentPage;
	// ÿҳ��ʾ����Ŀ
	private Integer pageSize;

	// start=1 pageNo=3��ҳ����ʾ�磺1��2��3
	private Integer start;// ��ʼҳ��

	public Pager(Integer totalNum, Integer currentPage, Integer pageSize) {
		this.totalNum = totalNum;
		this.currentPage = currentPage;
		this.pageSize = pageSize;

		// ������ҳ��
		this.totalPage = totalNum % this.pageSize == 0 ? totalNum
				/ this.pageSize : (totalNum / this.pageSize) + 1;

		this.start = currentPage;
		// ������Ϊ3���������ҳ����ֻ��2������ȫ����ʾ
		//this.pageNo = pageNo + currentPage - 1 >= this.totalPage ? pageNo
		//		: this.totalPage - currentPage + 1;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

//	public Integer getPageNo() {
//		return pageNo;
//	}
//
//	public void setPageNo(Integer pageNo) {
//		this.pageNo = pageNo;
//	}

	@Override
	public String toString() {
		return "Pager [list=" + list + ", totalNum=" + totalNum
				+ ", totalPage=" + totalPage + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", start=" + start + "]";
	}
	

}