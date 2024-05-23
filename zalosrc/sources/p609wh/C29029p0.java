package p609wh;

import com.zing.zalocore.connection.socket.RequestPacket;
import java.util.ArrayList;

/* renamed from: wh.p0 */
/* loaded from: classes3.dex */
public class C29029p0 {

    /* renamed from: a */
    public final String f134376a = getClass().getSimpleName();

    /* renamed from: b */
    private final ArrayList f134377b = new ArrayList();

    /* renamed from: a */
    public void m145027a(RequestPacket requestPacket) {
        try {
            synchronized (this.f134377b) {
                this.f134377b.add(requestPacket);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public RequestPacket m145028b() {
        if (this.f134377b.size() > 0) {
            return (RequestPacket) this.f134377b.remove(0);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m145029c() {
        return this.f134377b.isEmpty();
    }
}
