package e10;

import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e10.f */
/* loaded from: classes5.dex */
public abstract class AbstractC18169f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m96545b(Video video) {
        return video.m52834A0() ? 1 : 0;
    }

    /* renamed from: c */
    public static final boolean m96546c(ArrayList arrayList, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "filter");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) interfaceC18505l.mo205i9(next)).booleanValue()) {
                arrayList.remove(next);
                return true;
            }
        }
        return false;
    }
}
