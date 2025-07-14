package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /*@Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        MemberOnlyHash that = (MemberOnlyHash) object;
        return Objects.equals(id, that.id);
    }*/

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
