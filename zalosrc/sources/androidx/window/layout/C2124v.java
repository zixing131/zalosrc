package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.C2121s;
import androidx.window.layout.InterfaceC2120r;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p378o2.AbstractC23985f;
import p378o2.C23981b;
import qm0.AbstractC25368s;

/* renamed from: androidx.window.layout.v */
/* loaded from: classes2.dex */
public final class C2124v {

    /* renamed from: b */
    public static final a f9010b = new a(null);

    /* renamed from: c */
    private static final String f9011c = C2124v.class.getSimpleName();

    /* renamed from: a */
    private final AbstractC23985f.b f9012a;

    /* renamed from: androidx.window.layout.v$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m11411a(SidecarDeviceState sidecarDeviceState) {
            AbstractC19074t.m100208f(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        /* renamed from: b */
        public final int m11412b(SidecarDeviceState sidecarDeviceState) {
            AbstractC19074t.m100208f(sidecarDeviceState, "sidecarDeviceState");
            int m11411a = m11411a(sidecarDeviceState);
            if (m11411a < 0 || m11411a > 4) {
                return 0;
            }
            return m11411a;
        }

        /* renamed from: c */
        public final List m11413c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            List m131502j;
            List m131502j2;
            AbstractC19074t.m100208f(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    if (list == null) {
                        m131502j2 = AbstractC25368s.m131502j();
                        return m131502j2;
                    }
                    return list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    m131502j = AbstractC25368s.m131502j();
                    return m131502j;
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        /* renamed from: d */
        public final void m11414d(SidecarDeviceState sidecarDeviceState, int i11) {
            AbstractC19074t.m100208f(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i11;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.window.layout.v$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f9013q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SidecarDisplayFeature sidecarDisplayFeature) {
            AbstractC19074t.m100208f(sidecarDisplayFeature, "$this$require");
            boolean z11 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.window.layout.v$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f9014q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SidecarDisplayFeature sidecarDisplayFeature) {
            boolean z11;
            AbstractC19074t.m100208f(sidecarDisplayFeature, "$this$require");
            if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.window.layout.v$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f9015q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SidecarDisplayFeature sidecarDisplayFeature) {
            AbstractC19074t.m100208f(sidecarDisplayFeature, "$this$require");
            boolean z11 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.window.layout.v$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f9016q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SidecarDisplayFeature sidecarDisplayFeature) {
            boolean z11;
            AbstractC19074t.m100208f(sidecarDisplayFeature, "$this$require");
            if (sidecarDisplayFeature.getRect().left != 0 && sidecarDisplayFeature.getRect().top != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C2124v(AbstractC23985f.b bVar) {
        AbstractC19074t.m100208f(bVar, "verificationMode");
        this.f9012a = bVar;
    }

    /* renamed from: b */
    private final boolean m11404b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC19074t.m100204b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC19074t.m100204b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    private final boolean m11405c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            if (!m11404b((SidecarDisplayFeature) list.get(i11), (SidecarDisplayFeature) list2.get(i11))) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m11406a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC19074t.m100204b(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f9010b;
        if (aVar.m11412b(sidecarDeviceState) == aVar.m11412b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m11407d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC19074t.m100204b(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f9010b;
        return m11405c(aVar.m11413c(sidecarWindowLayoutInfo), aVar.m11413c(sidecarWindowLayoutInfo2));
    }

    /* renamed from: e */
    public final C2102f0 m11408e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        List m131502j;
        AbstractC19074t.m100208f(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            m131502j = AbstractC25368s.m131502j();
            return new C2102f0(m131502j);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = f9010b;
        aVar.m11414d(sidecarDeviceState2, aVar.m11412b(sidecarDeviceState));
        return new C2102f0(m11409f(aVar.m11413c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* renamed from: f */
    public final List m11409f(List list, SidecarDeviceState sidecarDeviceState) {
        AbstractC19074t.m100208f(list, "sidecarDisplayFeatures");
        AbstractC19074t.m100208f(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2113l m11410g = m11410g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (m11410g != null) {
                arrayList.add(m11410g);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final InterfaceC2113l m11410g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C2121s.b m11374a;
        InterfaceC2120r.a aVar;
        AbstractC19074t.m100208f(sidecarDisplayFeature, "feature");
        AbstractC19074t.m100208f(sidecarDeviceState, "deviceState");
        AbstractC23985f.a aVar2 = AbstractC23985f.f116070a;
        String str = f9011c;
        AbstractC19074t.m100207e(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) AbstractC23985f.a.m125496b(aVar2, sidecarDisplayFeature, str, this.f9012a, null, 4, null).mo125494c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f9013q).mo125494c("Feature bounds must not be 0", c.f9014q).mo125494c("TYPE_FOLD must have 0 area", d.f9015q).mo125494c("Feature be pinned to either left or top", e.f9016q).mo125493a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            m11374a = C2121s.b.f8999b.m11375b();
        } else {
            m11374a = C2121s.b.f8999b.m11374a();
        }
        int m11412b = f9010b.m11412b(sidecarDeviceState);
        if (m11412b == 0 || m11412b == 1) {
            return null;
        }
        if (m11412b != 2) {
            if (m11412b != 3) {
                if (m11412b == 4) {
                    return null;
                }
                aVar = InterfaceC2120r.a.f8992c;
            } else {
                aVar = InterfaceC2120r.a.f8992c;
            }
        } else {
            aVar = InterfaceC2120r.a.f8993d;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        AbstractC19074t.m100207e(rect, "feature.rect");
        return new C2121s(new C23981b(rect), m11374a, aVar);
    }

    public /* synthetic */ C2124v(AbstractC23985f.b bVar, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? AbstractC23985f.b.QUIET : bVar);
    }
}
