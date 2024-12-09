/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author uyn26
 */
public class User {
    private int Id;
    private String UserName;
    private String Password;
    private String FirstName;    
    private String LastName;
    private String Phone;
    private String Email;
    private boolean IsActive;
    private Date CreateAt;
    private Date UpdateAt;
    private Date DeleteAt;
    private String Image;
    private boolean IsCofirm;
    private int RoleId;
    private boolean IsRequest;

    public User() {
    }

    public User(int Id, String UserName, String Password, String FirstName, String LastName, String Phone, String Email, boolean IsActive, Date CreateAt, Date UpdateAt, Date DeleteAt, String Image, boolean IsCofirm, int RoleId, boolean IsRequest) {
        this.Id = Id;
        this.UserName = UserName;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
        this.IsActive = IsActive;
        this.CreateAt = CreateAt;
        this.UpdateAt = UpdateAt;
        this.DeleteAt = DeleteAt;
        this.Image = Image;
        this.IsCofirm = IsCofirm;
        this.RoleId = RoleId;
        this.IsRequest = IsRequest;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date CreateAt) {
        this.CreateAt = CreateAt;
    }

    public Date getUpdateAt() {
        return UpdateAt;
    }

    public void setUpdateAt(Date UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public Date getDeleteAt() {
        return DeleteAt;
    }

    public void setDeleteAt(Date DeleteAt) {
        this.DeleteAt = DeleteAt;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public boolean isIsCofirm() {
        return IsCofirm;
    }

    public void setIsCofirm(boolean IsCofirm) {
        this.IsCofirm = IsCofirm;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public boolean isIsRequest() {
        return IsRequest;
    }

    public void setIsRequest(boolean IsRequest) {
        this.IsRequest = IsRequest;
    }
    
    
}
