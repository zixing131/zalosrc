package com.google.protobuf;

import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.C6788b0;
import com.google.protobuf.InterfaceC6813j1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.h */
/* loaded from: classes3.dex */
public final class C6805h implements InterfaceC6813j1 {

    /* renamed from: a */
    private final CodedOutputStream f37311a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.h$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37312a;

        static {
            int[] iArr = new int[AbstractC6810i1.b.values().length];
            f37312a = iArr;
            try {
                iArr[AbstractC6810i1.b.f37336y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37335x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37333v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37324F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37326H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37322D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37334w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37331t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37325G.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37327I.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37332u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37312a[AbstractC6810i1.b.f37337z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C6805h(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) AbstractC6830s.m35130b(codedOutputStream, "output");
        this.f37311a = codedOutputStream2;
        codedOutputStream2.f37227a = this;
    }

    /* renamed from: P */
    public static C6805h m34904P(CodedOutputStream codedOutputStream) {
        C6805h c6805h = codedOutputStream.f37227a;
        if (c6805h != null) {
            return c6805h;
        }
        return new C6805h(codedOutputStream);
    }

    /* renamed from: Q */
    private void m34905Q(int i11, boolean z11, Object obj, C6788b0.a aVar) {
        this.f37311a.mo34669O0(i11, 2);
        this.f37311a.mo34671Q0(C6788b0.m34729b(aVar, Boolean.valueOf(z11), obj));
        C6788b0.m34731e(this.f37311a, aVar, Boolean.valueOf(z11), obj);
    }

    /* renamed from: R */
    private void m34906R(int i11, C6788b0.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = ((Integer) it.next()).intValue();
            i12++;
        }
        Arrays.sort(iArr);
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            Object obj = map.get(Integer.valueOf(i14));
            this.f37311a.mo34669O0(i11, 2);
            this.f37311a.mo34671Q0(C6788b0.m34729b(aVar, Integer.valueOf(i14), obj));
            C6788b0.m34731e(this.f37311a, aVar, Integer.valueOf(i14), obj);
        }
    }

    /* renamed from: S */
    private void m34907S(int i11, C6788b0.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            jArr[i12] = ((Long) it.next()).longValue();
            i12++;
        }
        Arrays.sort(jArr);
        for (int i13 = 0; i13 < size; i13++) {
            long j11 = jArr[i13];
            Object obj = map.get(Long.valueOf(j11));
            this.f37311a.mo34669O0(i11, 2);
            this.f37311a.mo34671Q0(C6788b0.m34729b(aVar, Long.valueOf(j11), obj));
            C6788b0.m34731e(this.f37311a, aVar, Long.valueOf(j11), obj);
        }
    }

    /* renamed from: T */
    private void m34908T(int i11, C6788b0.a aVar, Map map) {
        switch (a.f37312a[aVar.f37242a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m34905Q(i11, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m34905Q(i11, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m34906R(i11, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m34907S(i11, aVar, map);
                return;
            case 12:
                m34909U(i11, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f37242a);
        }
    }

    /* renamed from: U */
    private void m34909U(int i11, C6788b0.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            strArr[i12] = (String) it.next();
            i12++;
        }
        Arrays.sort(strArr);
        for (int i13 = 0; i13 < size; i13++) {
            String str = strArr[i13];
            Object obj = map.get(str);
            this.f37311a.mo34669O0(i11, 2);
            this.f37311a.mo34671Q0(C6788b0.m34729b(aVar, str, obj));
            C6788b0.m34731e(this.f37311a, aVar, str, obj);
        }
    }

    /* renamed from: V */
    private void m34910V(int i11, Object obj) {
        if (obj instanceof String) {
            this.f37311a.mo34667M0(i11, (String) obj);
        } else {
            this.f37311a.mo34684g0(i11, (AbstractC6799f) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: A */
    public void mo34911A(int i11, boolean z11) {
        this.f37311a.mo34680c0(i11, z11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: B */
    public void mo34912B(int i11, int i12) {
        this.f37311a.m34659E0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: C */
    public void mo34913C(int i11) {
        this.f37311a.mo34669O0(i11, 3);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: D */
    public void mo34914D(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34644p(((Long) list.get(i14)).longValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.mo34693p0(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34692o0(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: E */
    public void mo34915E(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34613G(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34660F0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34659E0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: F */
    public void mo34916F(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34633e(((Boolean) list.get(i14)).booleanValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34681d0(((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34680c0(i11, ((Boolean) list.get(i12)).booleanValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: G */
    public void mo34917G(int i11, C6788b0.a aVar, Map map) {
        if (this.f37311a.m34675X()) {
            m34908T(i11, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f37311a.mo34669O0(i11, 2);
            this.f37311a.mo34671Q0(C6788b0.m34729b(aVar, entry.getKey(), entry.getValue()));
            C6788b0.m34731e(this.f37311a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: H */
    public void mo34918H(int i11, float f11) {
        this.f37311a.m34694q0(i11, f11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: I */
    public void mo34919I(int i11) {
        this.f37311a.mo34669O0(i11, 4);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: J */
    public void mo34920J(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34617K(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34664J0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34663I0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: K */
    public void mo34921K(int i11, int i12) {
        this.f37311a.m34688k0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: L */
    public void mo34922L(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34653y(((Long) list.get(i14)).longValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34703z0(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34702y0(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: M */
    public void mo34923M(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34638j(((Double) list.get(i14)).doubleValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34687j0(((Double) list.get(i12)).doubleValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34686i0(i11, ((Double) list.get(i12)).doubleValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: N */
    public void mo34924N(int i11, int i12) {
        this.f37311a.m34663I0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: O */
    public void mo34925O(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f37311a.mo34684g0(i11, (AbstractC6799f) list.get(i12));
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: a */
    public void mo34926a(int i11, List list, InterfaceC6839w0 interfaceC6839w0) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            mo34948w(i11, list.get(i12), interfaceC6839w0);
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: b */
    public void mo34927b(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34646r(((Float) list.get(i14)).floatValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34695r0(((Float) list.get(i12)).floatValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34694q0(i11, ((Float) list.get(i12)).floatValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: c */
    public final void mo34928c(int i11, Object obj) {
        if (obj instanceof AbstractC6799f) {
            this.f37311a.mo34658D0(i11, (AbstractC6799f) obj);
        } else {
            this.f37311a.mo34657C0(i11, (InterfaceC6809i0) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: d */
    public void mo34929d(int i11, int i12) {
        this.f37311a.mo34690m0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: e */
    public void mo34930e(int i11, List list) {
        int i12 = 0;
        if (list instanceof InterfaceC6840x) {
            InterfaceC6840x interfaceC6840x = (InterfaceC6840x) list;
            while (i12 < list.size()) {
                m34910V(i11, interfaceC6840x.mo34823z0(i12));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34667M0(i11, (String) list.get(i12));
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: f */
    public void mo34931f(int i11, String str) {
        this.f37311a.mo34667M0(i11, str);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: g */
    public void mo34932g(int i11, long j11) {
        this.f37311a.mo34672R0(i11, j11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: h */
    public void mo34933h(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34651w(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.mo34701x0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34700w0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: i */
    public void mo34934i(int i11, Object obj, InterfaceC6839w0 interfaceC6839w0) {
        this.f37311a.m34697t0(i11, (InterfaceC6809i0) obj, interfaceC6839w0);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: j */
    public void mo34935j(int i11, AbstractC6799f abstractC6799f) {
        this.f37311a.mo34684g0(i11, abstractC6799f);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: k */
    public void mo34936k(int i11, int i12) {
        this.f37311a.mo34700w0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: l */
    public void mo34937l(int i11, long j11) {
        this.f37311a.m34661G0(i11, j11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: m */
    public void mo34938m(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34642n(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.mo34691n0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34690m0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: n */
    public void mo34939n(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34624R(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.mo34671Q0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34670P0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: o */
    public void mo34940o(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34619M(((Long) list.get(i14)).longValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34666L0(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34665K0(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: p */
    public void mo34941p(int i11, long j11) {
        this.f37311a.m34665K0(i11, j11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: q */
    public void mo34942q(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34640l(((Integer) list.get(i14)).intValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34689l0(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34688k0(i11, ((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: r */
    public void mo34943r(int i11, List list, InterfaceC6839w0 interfaceC6839w0) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            mo34934i(i11, list.get(i12), interfaceC6839w0);
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: s */
    public void mo34944s(int i11, int i12) {
        this.f37311a.mo34670P0(i11, i12);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: t */
    public void mo34945t(int i11, double d11) {
        this.f37311a.m34686i0(i11, d11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: u */
    public void mo34946u(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34615I(((Long) list.get(i14)).longValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.m34662H0(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.m34661G0(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: v */
    public void mo34947v(int i11, List list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f37311a.mo34669O0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.m34626T(((Long) list.get(i14)).longValue());
            }
            this.f37311a.mo34671Q0(i13);
            while (i12 < list.size()) {
                this.f37311a.mo34673S0(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f37311a.mo34672R0(i11, ((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: w */
    public void mo34948w(int i11, Object obj, InterfaceC6839w0 interfaceC6839w0) {
        this.f37311a.mo34655A0(i11, (InterfaceC6809i0) obj, interfaceC6839w0);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: x */
    public void mo34949x(int i11, long j11) {
        this.f37311a.mo34692o0(i11, j11);
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: y */
    public InterfaceC6813j1.a mo34950y() {
        return InterfaceC6813j1.a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC6813j1
    /* renamed from: z */
    public void mo34951z(int i11, long j11) {
        this.f37311a.m34702y0(i11, j11);
    }
}
