package p291k7;

import com.google.android.play.core.splitinstall.internal.AbstractC6516c;
import java.io.File;

/* renamed from: k7.f0 */
/* loaded from: classes3.dex */
final class C21502f0 implements InterfaceC21543t {
    @Override // p291k7.InterfaceC21543t
    /* renamed from: a */
    public final boolean mo111122a(Object obj, File file, File file2) {
        try {
            if (((Boolean) AbstractC6516c.m33398f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue()) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
