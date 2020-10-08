/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Nicolaas'
 */
@ManagedBean
@RequestScoped
public class CourseDetailsBean
{
private String CourseName;
private HtmlOutputText CourseId, CourseDuration, CourseEligibility, CourseFee;
public CourseDetailsBean() {
}
public void CourseDetailsAction(ValueChangeEvent vce)
{
String id = vce.getNewValue().toString();
String cId=" ", cDuration="", cEligibility="", cFee="";
if(id.compareTo("Science")==0)
{
cId="A-101";
cDuration="4 years";
cEligibility="70% in high school";
cFee="$5000 p.a.";
}
else if(id.compareTo("Law") == 0)
{
cId="A-105";
cDuration="5 years";
cEligibility="60% in high school";
cFee="$3000 p.a.";
}
else if(id.compareTo("Medical") == 0)
{
cId="A-110";
cDuration="6 years";
cEligibility="70% in high school";
cFee="$7000 p.a.";
}
else if(id.compareTo("Management") == 0)
{
cId="A-115";
cDuration="2 years";
cEligibility="50% in high school";
cFee="$5000 p.a.";
}
getCourseId().setValue(cId);
getCourseDuration().setValue(cDuration);
getCourseEligibility().setValue(cEligibility);
getCourseFee().setValue(cFee);
}
public String getCourseName()
{return CourseName;
}
public void setCourseName(String CourseName)
{
this.CourseName = CourseName;
}
public HtmlOutputText getCourseId()
{
return CourseId;
}
public void setCourseId(HtmlOutputText CourseId)
{
this.CourseId = CourseId;
}
public HtmlOutputText getCourseDuration()
{
return CourseDuration;
}
public void setCourseDuration(HtmlOutputText CourseDuration)
{
this.CourseDuration = CourseDuration;
}
public HtmlOutputText getCourseEligibility()
{
return CourseEligibility;
}
public void setCourseEligibility(HtmlOutputText CourseEligibility)
{
this.CourseEligibility = CourseEligibility;
}
public HtmlOutputText getCourseFee()
{
return CourseFee;
}
public void setCourseFee(HtmlOutputText CourseFee)
{
this.CourseFee = CourseFee;
}
}
