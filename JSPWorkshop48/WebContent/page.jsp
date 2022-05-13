<%@page import="com.dto.PageDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    PageDTO xxx = (PageDTO)request.getAttribute("pDTO");
    int curPage = xxx.getCurPage();
    int perPage = xxx.getPerPage();
    int totalCount = xxx.getTotalCount();
    
    int totalNum = totalCount/perPage;
    if(totalCount%perPage!=0) totalNum++;
    
	String searchName = (String)request.getAttribute("searchName");
	String searchValue = (String)request.getAttribute("searchValue");
	int perBlock = xxx.getPerBlock();
	
   /*  for(int i = 1 ; i  <= totalNum ; i++){
    	if(curPage == i){
    		out.print(i+"&nbsp;");
    	}else{
    		out.print( "<a href='MyBoardListServlet?curPage="+i+"&searchName="+searchName+"&searchValue="+searchValue+"'>"+i  +"</a>&nbsp;" );
    	}
    	
    	
    } */
    
 // 현재 화면에 보여질 페이지번호들의 시작페이지번호, 마지막페이지번호 구하기
    // 현재 페이지번호의 블럭번호 구하기
    int curBlock = ( int )Math.ceil( ( double )curPage / perBlock );

    // 시작페이지번호 구하기
    int startPage = ( curBlock - 1 ) * perBlock + 1;
    
    // 마지막페이지번호 구하기
    int endPage = startPage + perBlock - 1;
    if ( endPage > totalNum ) endPage = totalNum;
    
    System.out.println("curBlock"+curBlock);
    System.out.println("startPage"+startPage);
    System.out.println("endPage"+endPage);
    System.out.println("curPage"+curPage);
    System.out.println("perPage"+perPage);
    System.out.println("totalNum"+totalNum);
 // 페이지번호 출력 시작

    // 1. 첫 페이지로 바로 이동
    if ( curPage == 1 )
        out.print( "처음" );
    else
        out.print( "<a href='EmpListServlet?curPage=1&searchName=" + searchName + "&searchValue=" + searchValue + "'>처음</a>" );

    out.print( "&nbsp;" );

    // 2. 이전 페이지 블럭으로 이동
    if ( startPage == 1 )
        out.print( "&lt;&lt;" );
    else
        out.print( "<a  href='EmpListServlet?curPage=" + ( startPage - 1 ) + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>&lt;&lt;</a>" );

    out.print( "&nbsp;" );

    // 3. 이전 페이지로 이동
    if ( curPage == 1 )
        out.print( "&lt;" );
    else
        out.print( "<a href='EmpListServlet?curPage=" + ( curPage - 1 ) + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>&lt;</a>" );

    out.print( "&nbsp;" );

    // 4. 페이지번호들
    for ( int i = startPage; i < endPage; i++  ) { // 마지막페이지번호는 표시 안 하고, for 루프 밑에서 표시( 공백 표시 때문에... )

        if ( curPage == i )
            out.print( i );
        else
        out.print( "<a href='EmpListServlet?curPage=" + i + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>" + i + "</a>" );

        out.print( ",&nbsp;" );

    } // end for ( int i = startPage; i < endPage; i++  )

    if ( curPage == endPage )
        out.print( endPage );
    else
        out.print( "<a  href='EmpListServlet?curPage=" + endPage + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>" + endPage + "</a>" );

    // 3. 다음 페이지로 이동
    out.print( "&nbsp;" );

    if ( curPage == totalNum )
        out.print( "&gt;" );
    else
        out.print( "<a  href='EmpListServlet?curPage=" + ( curPage + 1 ) + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>&gt;</a>" );

    // 2. 다음 페이지 블럭으로 이동
    out.print( "&nbsp;" );

    if ( endPage == totalNum )
        out.print( "&gt;&gt;" );
    else
        out.print( "<a  href='EmpListServlet?curPage=" + ( endPage + 1 ) + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>&gt;&gt;</a>" );

    // 1. 마지막 페이지로 바로 이동
    out.print( "&nbsp;" );

    if ( curPage == totalNum )
        out.print( "마지막" );
    else
        out.print( "<a  href='EmpListServlet?curPage=" + totalNum + "&searchName=" + searchName + "&searchValue=" + searchValue + "'>마지막</a>" );

    
%>