package p119e2;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public interface InterfaceC18182g extends Closeable {
    /* renamed from: B0 */
    Cursor mo188B0(InterfaceC18185j interfaceC18185j);

    /* renamed from: C */
    void mo189C(String str, Object[] objArr);

    /* renamed from: D */
    void mo190D();

    /* renamed from: H */
    Cursor mo191H(InterfaceC18185j interfaceC18185j, CancellationSignal cancellationSignal);

    /* renamed from: b0 */
    InterfaceC18186k mo193b0(String str);

    /* renamed from: e */
    void mo194e();

    /* renamed from: g */
    List mo195g();

    boolean isOpen();

    /* renamed from: k */
    void mo196k();

    /* renamed from: l */
    void mo197l();

    /* renamed from: m */
    String mo198m();

    /* renamed from: m0 */
    int mo199m0(String str, int i11, ContentValues contentValues, String str2, Object[] objArr);

    /* renamed from: q0 */
    Cursor mo200q0(String str);

    /* renamed from: u */
    void mo201u(String str);

    /* renamed from: v0 */
    boolean mo202v0();

    /* renamed from: x0 */
    boolean mo203x0();
}
