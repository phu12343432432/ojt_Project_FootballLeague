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


public class Team {
    private int Id;
    private String Name;
    private String ShortName;    
    private String Description;
    private int TeamSize;
    private String Image;
    private Date CreateAt;
    private Date UpdateAt;
    private Date DeleteAt;
    private boolean IsActive;
    private int UserId;

    public Team() {
    }

    public Team(int Id, String Name, String ShortName, String Description, int TeamSize, String Image, Date CreateAt, Date UpdateAt, Date DeleteAt, boolean IsActive, int UserId) {
        this.Id = Id;
        this.Name = Name;
        this.ShortName = ShortName;
        this.Description = Description;
        this.TeamSize = TeamSize;
        this.Image = Image;
        this.CreateAt = CreateAt;
        this.UpdateAt = UpdateAt;
        this.DeleteAt = DeleteAt;
        this.IsActive = IsActive;
        this.UserId = UserId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getTeamSize() {
        return TeamSize;
    }

    public void setTeamSize(int TeamSize) {
        this.TeamSize = TeamSize;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
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

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
    
}
