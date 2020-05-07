package id.ac.umn.quiz1;

/**
 * Created by aldo_ on 20/03/2018.
 */

class Member {
    private int _id;
    private String _name, _position;

    Member(int id, String name, String position){
        this._id = id;
        this._name = name;
        this._position = position;
    }

    int get_id() {
        return _id;
    }

    void set_id(int _id) {
        this._id = _id;
    }

    String get_name() {
        return _name;
    }

    void set_name(String _name) {
        this._name = _name;
    }

    String get_position() {
        return _position;
    }

    void set_position(String _position) {
        this._position = _position;
    }
}
