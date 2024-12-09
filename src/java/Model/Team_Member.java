/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author uyn26
 */
public class Team_Member {
    private int Id;
    private String Name;
    private int Number;
    private int TeamId;
    private String Image;

    public Team_Member() {
    }

    public Team_Member(int Id, String Name, int Number, int TeamId, String Image) {
        this.Id = Id;
        this.Name = Name;
        this.Number = Number;
        this.TeamId = TeamId;
        this.Image = Image;
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

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getTeamId() {
        return TeamId;
    }

    public void setTeamId(int TeamId) {
        this.TeamId = TeamId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
    
    
}
