package p320ld;

import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19074t;
import p348mi.AbstractC23306f;

/* renamed from: ld.c */
/* loaded from: classes3.dex */
public abstract class AbstractC22431c {
    /* renamed from: a */
    public static final boolean m115870a(TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(targetBackupInfo, "<this>");
        if (targetBackupInfo.m40953i() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m115871b(TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(targetBackupInfo, "<this>");
        return AbstractC23306f.m120646b1().m150816m(targetBackupInfo.m40953i());
    }
}
