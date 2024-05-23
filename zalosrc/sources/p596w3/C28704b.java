package p596w3;

import android.graphics.Matrix;
import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.b */
/* loaded from: classes2.dex */
public class C28704b extends AbstractC28708f {
    private C28704b(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28704b m143755e(C27495c c27495c) {
        return new C28704b(c27495c.m140598d(), c27495c.m140600f());
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        if (c27496d2 == null) {
            matrix.postTranslate(-c27496d.m140604b()[0], -c27496d.m140604b()[1]);
        } else {
            matrix.postTranslate(-AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11), -AbstractC28708f.m143778c(c27496d.m140604b()[1], c27496d2.m140604b()[1], f11));
        }
    }
}
