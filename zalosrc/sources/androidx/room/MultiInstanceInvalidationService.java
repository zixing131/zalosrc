package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import p008a2.InterfaceC0075l;
import p008a2.InterfaceC0076m;
import pm0.C24848g0;

/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: p */
    private int f8224p;

    /* renamed from: q */
    private final Map f8225q = new LinkedHashMap();

    /* renamed from: r */
    private final RemoteCallbackList f8226r = new RemoteCallbackListC1935b();

    /* renamed from: s */
    private final InterfaceC0076m.a f8227s = new BinderC1934a();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes2.dex */
    public static final class BinderC1934a extends InterfaceC0076m.a {
        BinderC1934a() {
        }

        @Override // p008a2.InterfaceC0076m
        /* renamed from: A2 */
        public int mo268A2(InterfaceC0075l interfaceC0075l, String str) {
            AbstractC19074t.m100208f(interfaceC0075l, "callback");
            int i11 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList m10695a = MultiInstanceInvalidationService.this.m10695a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m10695a) {
                try {
                    multiInstanceInvalidationService.m10698d(multiInstanceInvalidationService.m10697c() + 1);
                    int m10697c = multiInstanceInvalidationService.m10697c();
                    if (multiInstanceInvalidationService.m10695a().register(interfaceC0075l, Integer.valueOf(m10697c))) {
                        multiInstanceInvalidationService.m10696b().put(Integer.valueOf(m10697c), str);
                        i11 = m10697c;
                    } else {
                        multiInstanceInvalidationService.m10698d(multiInstanceInvalidationService.m10697c() - 1);
                        multiInstanceInvalidationService.m10697c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }

        @Override // p008a2.InterfaceC0076m
        /* renamed from: V1 */
        public void mo269V1(InterfaceC0075l interfaceC0075l, int i11) {
            AbstractC19074t.m100208f(interfaceC0075l, "callback");
            RemoteCallbackList m10695a = MultiInstanceInvalidationService.this.m10695a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m10695a) {
                multiInstanceInvalidationService.m10695a().unregister(interfaceC0075l);
            }
        }

        @Override // p008a2.InterfaceC0076m
        /* renamed from: r2 */
        public void mo270r2(int i11, String[] strArr) {
            AbstractC19074t.m100208f(strArr, "tables");
            RemoteCallbackList m10695a = MultiInstanceInvalidationService.this.m10695a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m10695a) {
                try {
                    String str = (String) multiInstanceInvalidationService.m10696b().get(Integer.valueOf(i11));
                    if (str == null) {
                        return;
                    }
                    int beginBroadcast = multiInstanceInvalidationService.m10695a().beginBroadcast();
                    for (int i12 = 0; i12 < beginBroadcast; i12++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.m10695a().getBroadcastCookie(i12);
                            AbstractC19074t.m100206d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) broadcastCookie).intValue();
                            String str2 = (String) multiInstanceInvalidationService.m10696b().get(Integer.valueOf(intValue));
                            if (i11 != intValue && AbstractC19074t.m100204b(str, str2)) {
                                try {
                                    ((InterfaceC0075l) multiInstanceInvalidationService.m10695a().getBroadcastItem(i12)).mo266p0(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.m10695a().finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.m10695a().finishBroadcast();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes2.dex */
    public static final class RemoteCallbackListC1935b extends RemoteCallbackList {
        RemoteCallbackListC1935b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC0075l interfaceC0075l, Object obj) {
            AbstractC19074t.m100208f(interfaceC0075l, "callback");
            AbstractC19074t.m100208f(obj, "cookie");
            MultiInstanceInvalidationService.this.m10696b().remove((Integer) obj);
        }
    }

    /* renamed from: a */
    public final RemoteCallbackList m10695a() {
        return this.f8226r;
    }

    /* renamed from: b */
    public final Map m10696b() {
        return this.f8225q;
    }

    /* renamed from: c */
    public final int m10697c() {
        return this.f8224p;
    }

    /* renamed from: d */
    public final void m10698d(int i11) {
        this.f8224p = i11;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        return this.f8227s;
    }
}
