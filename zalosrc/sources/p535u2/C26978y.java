package p535u2;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2254v;
import androidx.work.EnumC2258z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0073j;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p046c2.AbstractC3208d;
import p119e2.InterfaceC18186k;
import p535u2.C26976w;

/* renamed from: u2.y */
/* loaded from: classes.dex */
public final class C26978y implements InterfaceC26977x {

    /* renamed from: a */
    private final AbstractC0086w f127539a;

    /* renamed from: b */
    private final AbstractC0074k f127540b;

    /* renamed from: c */
    private final AbstractC0073j f127541c;

    /* renamed from: d */
    private final AbstractC0066f0 f127542d;

    /* renamed from: e */
    private final AbstractC0066f0 f127543e;

    /* renamed from: f */
    private final AbstractC0066f0 f127544f;

    /* renamed from: g */
    private final AbstractC0066f0 f127545g;

    /* renamed from: h */
    private final AbstractC0066f0 f127546h;

    /* renamed from: i */
    private final AbstractC0066f0 f127547i;

    /* renamed from: j */
    private final AbstractC0066f0 f127548j;

    /* renamed from: k */
    private final AbstractC0066f0 f127549k;

    /* renamed from: l */
    private final AbstractC0066f0 f127550l;

    /* renamed from: m */
    private final AbstractC0066f0 f127551m;

    /* renamed from: n */
    private final AbstractC0066f0 f127552n;

    /* renamed from: o */
    private final AbstractC0066f0 f127553o;

    /* renamed from: p */
    private final AbstractC0066f0 f127554p;

    /* renamed from: q */
    private final AbstractC0066f0 f127555q;

    /* renamed from: r */
    private final AbstractC0066f0 f127556r;

    /* renamed from: u2.y$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0066f0 {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: u2.y$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0066f0 {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* renamed from: u2.y$d */
    /* loaded from: classes.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: u2.y$f */
    /* loaded from: classes.dex */
    class f extends AbstractC0066f0 {
        f(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: u2.y$g */
    /* loaded from: classes.dex */
    class g extends AbstractC0066f0 {
        g(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: u2.y$h */
    /* loaded from: classes.dex */
    class h extends AbstractC0066f0 {
        h(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$i */
    /* loaded from: classes.dex */
    class i extends AbstractC0074k {
        i(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26976w c26976w) {
            String str = c26976w.f127497a;
            if (str == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, str);
            }
            C26958e0 c26958e0 = C26958e0.f127460a;
            interfaceC18186k.mo220l0(2, C26958e0.m138933j(c26976w.f127498b));
            String str2 = c26976w.f127499c;
            if (str2 == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, str2);
            }
            String str3 = c26976w.f127500d;
            if (str3 == null) {
                interfaceC18186k.mo222u0(4);
            } else {
                interfaceC18186k.mo219a0(4, str3);
            }
            byte[] m11529l = C2148h.m11529l(c26976w.f127501e);
            if (m11529l == null) {
                interfaceC18186k.mo222u0(5);
            } else {
                interfaceC18186k.mo221n0(5, m11529l);
            }
            byte[] m11529l2 = C2148h.m11529l(c26976w.f127502f);
            if (m11529l2 == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo221n0(6, m11529l2);
            }
            interfaceC18186k.mo220l0(7, c26976w.f127503g);
            interfaceC18186k.mo220l0(8, c26976w.f127504h);
            interfaceC18186k.mo220l0(9, c26976w.f127505i);
            interfaceC18186k.mo220l0(10, c26976w.f127507k);
            interfaceC18186k.mo220l0(11, C26958e0.m138924a(c26976w.f127508l));
            interfaceC18186k.mo220l0(12, c26976w.f127509m);
            interfaceC18186k.mo220l0(13, c26976w.f127510n);
            interfaceC18186k.mo220l0(14, c26976w.f127511o);
            interfaceC18186k.mo220l0(15, c26976w.f127512p);
            interfaceC18186k.mo220l0(16, c26976w.f127513q ? 1L : 0L);
            interfaceC18186k.mo220l0(17, C26958e0.m138931h(c26976w.f127514r));
            interfaceC18186k.mo220l0(18, c26976w.m138978i());
            interfaceC18186k.mo220l0(19, c26976w.m138975f());
            interfaceC18186k.mo220l0(20, c26976w.m138976g());
            interfaceC18186k.mo220l0(21, c26976w.m138977h());
            interfaceC18186k.mo220l0(22, c26976w.m138979j());
            C2142e c2142e = c26976w.f127506j;
            if (c2142e != null) {
                interfaceC18186k.mo220l0(23, C26958e0.m138930g(c2142e.m11507d()));
                interfaceC18186k.mo220l0(24, c2142e.m11510g() ? 1L : 0L);
                interfaceC18186k.mo220l0(25, c2142e.m11511h() ? 1L : 0L);
                interfaceC18186k.mo220l0(26, c2142e.m11509f() ? 1L : 0L);
                interfaceC18186k.mo220l0(27, c2142e.m11512i() ? 1L : 0L);
                interfaceC18186k.mo220l0(28, c2142e.m11505b());
                interfaceC18186k.mo220l0(29, c2142e.m11504a());
                byte[] m138932i = C26958e0.m138932i(c2142e.m11506c());
                if (m138932i == null) {
                    interfaceC18186k.mo222u0(30);
                    return;
                } else {
                    interfaceC18186k.mo221n0(30, m138932i);
                    return;
                }
            }
            interfaceC18186k.mo222u0(23);
            interfaceC18186k.mo222u0(24);
            interfaceC18186k.mo222u0(25);
            interfaceC18186k.mo222u0(26);
            interfaceC18186k.mo222u0(27);
            interfaceC18186k.mo222u0(28);
            interfaceC18186k.mo222u0(29);
            interfaceC18186k.mo222u0(30);
        }
    }

    /* renamed from: u2.y$j */
    /* loaded from: classes2.dex */
    class j implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f127566a;

        j(C0089z c0089z) {
            this.f127566a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            byte[] blob;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            byte[] blob2;
            C26978y.this.f127539a.m342e();
            try {
                Cursor m16306c = AbstractC3206b.m16306c(C26978y.this.f127539a, this.f127566a, true, null);
                try {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (m16306c.moveToNext()) {
                        String string2 = m16306c.getString(0);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            hashMap.put(string2, new ArrayList());
                        }
                        String string3 = m16306c.getString(0);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                    }
                    m16306c.moveToPosition(-1);
                    C26978y.this.m139026G(hashMap);
                    C26978y.this.m139025F(hashMap2);
                    ArrayList arrayList = new ArrayList(m16306c.getCount());
                    while (m16306c.moveToNext()) {
                        if (m16306c.isNull(0)) {
                            string = null;
                        } else {
                            string = m16306c.getString(0);
                        }
                        C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(1));
                        if (m16306c.isNull(2)) {
                            blob = null;
                        } else {
                            blob = m16306c.getBlob(2);
                        }
                        C2148h m11528g = C2148h.m11528g(blob);
                        int i11 = m16306c.getInt(3);
                        int i12 = m16306c.getInt(4);
                        long j11 = m16306c.getLong(13);
                        long j12 = m16306c.getLong(14);
                        long j13 = m16306c.getLong(15);
                        EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(16));
                        long j14 = m16306c.getLong(17);
                        long j15 = m16306c.getLong(18);
                        int i13 = m16306c.getInt(19);
                        long j16 = m16306c.getLong(20);
                        int i14 = m16306c.getInt(21);
                        EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(5));
                        if (m16306c.getInt(6) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (m16306c.getInt(7) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (m16306c.getInt(8) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (m16306c.getInt(9) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        long j17 = m16306c.getLong(10);
                        long j18 = m16306c.getLong(11);
                        if (m16306c.isNull(12)) {
                            blob2 = null;
                        } else {
                            blob2 = m16306c.getBlob(12);
                        }
                        C2142e c2142e = new C2142e(m138927d, z11, z12, z13, z14, j17, j18, C26958e0.m138925b(blob2));
                        ArrayList arrayList2 = (ArrayList) hashMap.get(m16306c.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(m16306c.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new C26976w.c(string, m138929f, m11528g, j11, j12, j13, c2142e, i11, m138926c, j14, j15, i13, i12, j16, i14, arrayList3, arrayList4));
                    }
                    C26978y.this.f127539a.m339E();
                    m16306c.close();
                    return arrayList;
                } catch (Throwable th2) {
                    m16306c.close();
                    throw th2;
                }
            } finally {
                C26978y.this.f127539a.m347j();
            }
        }

        protected void finalize() {
            this.f127566a.m406h();
        }
    }

    /* renamed from: u2.y$k */
    /* loaded from: classes2.dex */
    class k implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f127568a;

        k(C0089z c0089z) {
            this.f127568a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            byte[] blob;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            byte[] blob2;
            C26978y.this.f127539a.m342e();
            try {
                Cursor m16306c = AbstractC3206b.m16306c(C26978y.this.f127539a, this.f127568a, true, null);
                try {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (m16306c.moveToNext()) {
                        String string2 = m16306c.getString(0);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            hashMap.put(string2, new ArrayList());
                        }
                        String string3 = m16306c.getString(0);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                    }
                    m16306c.moveToPosition(-1);
                    C26978y.this.m139026G(hashMap);
                    C26978y.this.m139025F(hashMap2);
                    ArrayList arrayList = new ArrayList(m16306c.getCount());
                    while (m16306c.moveToNext()) {
                        if (m16306c.isNull(0)) {
                            string = null;
                        } else {
                            string = m16306c.getString(0);
                        }
                        C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(1));
                        if (m16306c.isNull(2)) {
                            blob = null;
                        } else {
                            blob = m16306c.getBlob(2);
                        }
                        C2148h m11528g = C2148h.m11528g(blob);
                        int i11 = m16306c.getInt(3);
                        int i12 = m16306c.getInt(4);
                        long j11 = m16306c.getLong(13);
                        long j12 = m16306c.getLong(14);
                        long j13 = m16306c.getLong(15);
                        EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(16));
                        long j14 = m16306c.getLong(17);
                        long j15 = m16306c.getLong(18);
                        int i13 = m16306c.getInt(19);
                        long j16 = m16306c.getLong(20);
                        int i14 = m16306c.getInt(21);
                        EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(5));
                        if (m16306c.getInt(6) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (m16306c.getInt(7) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (m16306c.getInt(8) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (m16306c.getInt(9) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        long j17 = m16306c.getLong(10);
                        long j18 = m16306c.getLong(11);
                        if (m16306c.isNull(12)) {
                            blob2 = null;
                        } else {
                            blob2 = m16306c.getBlob(12);
                        }
                        C2142e c2142e = new C2142e(m138927d, z11, z12, z13, z14, j17, j18, C26958e0.m138925b(blob2));
                        ArrayList arrayList2 = (ArrayList) hashMap.get(m16306c.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(m16306c.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new C26976w.c(string, m138929f, m11528g, j11, j12, j13, c2142e, i11, m138926c, j14, j15, i13, i12, j16, i14, arrayList3, arrayList4));
                    }
                    C26978y.this.f127539a.m339E();
                    m16306c.close();
                    return arrayList;
                } catch (Throwable th2) {
                    m16306c.close();
                    throw th2;
                }
            } finally {
                C26978y.this.f127539a.m347j();
            }
        }

        protected void finalize() {
            this.f127568a.m406h();
        }
    }

    /* renamed from: u2.y$l */
    /* loaded from: classes.dex */
    class l extends AbstractC0073j {
        l(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C26976w c26976w) {
            String str = c26976w.f127497a;
            if (str == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, str);
            }
            C26958e0 c26958e0 = C26958e0.f127460a;
            interfaceC18186k.mo220l0(2, C26958e0.m138933j(c26976w.f127498b));
            String str2 = c26976w.f127499c;
            if (str2 == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, str2);
            }
            String str3 = c26976w.f127500d;
            if (str3 == null) {
                interfaceC18186k.mo222u0(4);
            } else {
                interfaceC18186k.mo219a0(4, str3);
            }
            byte[] m11529l = C2148h.m11529l(c26976w.f127501e);
            if (m11529l == null) {
                interfaceC18186k.mo222u0(5);
            } else {
                interfaceC18186k.mo221n0(5, m11529l);
            }
            byte[] m11529l2 = C2148h.m11529l(c26976w.f127502f);
            if (m11529l2 == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo221n0(6, m11529l2);
            }
            interfaceC18186k.mo220l0(7, c26976w.f127503g);
            interfaceC18186k.mo220l0(8, c26976w.f127504h);
            interfaceC18186k.mo220l0(9, c26976w.f127505i);
            interfaceC18186k.mo220l0(10, c26976w.f127507k);
            interfaceC18186k.mo220l0(11, C26958e0.m138924a(c26976w.f127508l));
            interfaceC18186k.mo220l0(12, c26976w.f127509m);
            interfaceC18186k.mo220l0(13, c26976w.f127510n);
            interfaceC18186k.mo220l0(14, c26976w.f127511o);
            interfaceC18186k.mo220l0(15, c26976w.f127512p);
            interfaceC18186k.mo220l0(16, c26976w.f127513q ? 1L : 0L);
            interfaceC18186k.mo220l0(17, C26958e0.m138931h(c26976w.f127514r));
            interfaceC18186k.mo220l0(18, c26976w.m138978i());
            interfaceC18186k.mo220l0(19, c26976w.m138975f());
            interfaceC18186k.mo220l0(20, c26976w.m138976g());
            interfaceC18186k.mo220l0(21, c26976w.m138977h());
            interfaceC18186k.mo220l0(22, c26976w.m138979j());
            C2142e c2142e = c26976w.f127506j;
            if (c2142e != null) {
                interfaceC18186k.mo220l0(23, C26958e0.m138930g(c2142e.m11507d()));
                interfaceC18186k.mo220l0(24, c2142e.m11510g() ? 1L : 0L);
                interfaceC18186k.mo220l0(25, c2142e.m11511h() ? 1L : 0L);
                interfaceC18186k.mo220l0(26, c2142e.m11509f() ? 1L : 0L);
                interfaceC18186k.mo220l0(27, c2142e.m11512i() ? 1L : 0L);
                interfaceC18186k.mo220l0(28, c2142e.m11505b());
                interfaceC18186k.mo220l0(29, c2142e.m11504a());
                byte[] m138932i = C26958e0.m138932i(c2142e.m11506c());
                if (m138932i == null) {
                    interfaceC18186k.mo222u0(30);
                } else {
                    interfaceC18186k.mo221n0(30, m138932i);
                }
            } else {
                interfaceC18186k.mo222u0(23);
                interfaceC18186k.mo222u0(24);
                interfaceC18186k.mo222u0(25);
                interfaceC18186k.mo222u0(26);
                interfaceC18186k.mo222u0(27);
                interfaceC18186k.mo222u0(28);
                interfaceC18186k.mo222u0(29);
                interfaceC18186k.mo222u0(30);
            }
            String str4 = c26976w.f127497a;
            if (str4 == null) {
                interfaceC18186k.mo222u0(31);
            } else {
                interfaceC18186k.mo219a0(31, str4);
            }
        }
    }

    /* renamed from: u2.y$m */
    /* loaded from: classes.dex */
    class m extends AbstractC0066f0 {
        m(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: u2.y$n */
    /* loaded from: classes.dex */
    class n extends AbstractC0066f0 {
        n(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$o */
    /* loaded from: classes.dex */
    class o extends AbstractC0066f0 {
        o(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* renamed from: u2.y$p */
    /* loaded from: classes.dex */
    class p extends AbstractC0066f0 {
        p(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: u2.y$q */
    /* loaded from: classes.dex */
    class q extends AbstractC0066f0 {
        q(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$r */
    /* loaded from: classes.dex */
    class r extends AbstractC0066f0 {
        r(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: u2.y$s */
    /* loaded from: classes.dex */
    class s extends AbstractC0066f0 {
        s(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public C26978y(AbstractC0086w abstractC0086w) {
        this.f127539a = abstractC0086w;
        this.f127540b = new i(abstractC0086w);
        this.f127541c = new l(abstractC0086w);
        this.f127542d = new m(abstractC0086w);
        this.f127543e = new n(abstractC0086w);
        this.f127544f = new o(abstractC0086w);
        this.f127545g = new p(abstractC0086w);
        this.f127546h = new q(abstractC0086w);
        this.f127547i = new r(abstractC0086w);
        this.f127548j = new s(abstractC0086w);
        this.f127549k = new a(abstractC0086w);
        this.f127550l = new b(abstractC0086w);
        this.f127551m = new c(abstractC0086w);
        this.f127552n = new d(abstractC0086w);
        this.f127553o = new e(abstractC0086w);
        this.f127554p = new f(abstractC0086w);
        this.f127555q = new g(abstractC0086w);
        this.f127556r = new h(abstractC0086w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m139025F(HashMap hashMap) {
        byte[] blob;
        int i11;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i11 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i11++;
                    if (i11 == 999) {
                        break;
                    }
                }
                m139025F(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i11 > 0) {
                m139025F(hashMap2);
                return;
            }
            return;
        }
        StringBuilder m16310b = AbstractC3208d.m16310b();
        m16310b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        AbstractC3208d.m16309a(m16310b, size);
        m16310b.append(")");
        C0089z m401c = C0089z.m401c(m16310b.toString(), size);
        int i12 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                m401c.mo222u0(i12);
            } else {
                m401c.mo219a0(i12, str2);
            }
            i12++;
        }
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            int m16302d = AbstractC3205a.m16302d(m16306c, "work_spec_id");
            if (m16302d == -1) {
                return;
            }
            while (m16306c.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(m16306c.getString(m16302d));
                if (arrayList != null) {
                    if (m16306c.isNull(0)) {
                        blob = null;
                    } else {
                        blob = m16306c.getBlob(0);
                    }
                    arrayList.add(C2148h.m11528g(blob));
                }
            }
        } finally {
            m16306c.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m139026G(HashMap hashMap) {
        String string;
        int i11;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i11 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i11++;
                    if (i11 == 999) {
                        break;
                    }
                }
                m139026G(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i11 > 0) {
                m139026G(hashMap2);
                return;
            }
            return;
        }
        StringBuilder m16310b = AbstractC3208d.m16310b();
        m16310b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        AbstractC3208d.m16309a(m16310b, size);
        m16310b.append(")");
        C0089z m401c = C0089z.m401c(m16310b.toString(), size);
        int i12 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                m401c.mo222u0(i12);
            } else {
                m401c.mo219a0(i12, str2);
            }
            i12++;
        }
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            int m16302d = AbstractC3205a.m16302d(m16306c, "work_spec_id");
            if (m16302d == -1) {
                return;
            }
            while (m16306c.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(m16306c.getString(m16302d));
                if (arrayList != null) {
                    if (m16306c.isNull(0)) {
                        string = null;
                    } else {
                        string = m16306c.getString(0);
                    }
                    arrayList.add(string);
                }
            }
        } finally {
            m16306c.close();
        }
    }

    /* renamed from: K */
    public static List m139030K() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: A */
    public List mo138994A() {
        C0089z c0089z;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            int m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            int m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            int m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            int m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            int m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            int m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
            try {
                int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
                int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
                int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
                int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
                int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
                int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
                int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
                int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
                int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
                int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
                int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
                int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
                int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
                int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
                int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
                int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
                int i16 = m16303e14;
                ArrayList arrayList = new ArrayList(m16306c.getCount());
                while (m16306c.moveToNext()) {
                    if (m16306c.isNull(m16303e)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e);
                    }
                    C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        blob = null;
                    } else {
                        blob = m16306c.getBlob(m16303e5);
                    }
                    C2148h m11528g = C2148h.m11528g(blob);
                    if (m16306c.isNull(m16303e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m16306c.getBlob(m16303e6);
                    }
                    C2148h m11528g2 = C2148h.m11528g(blob2);
                    long j11 = m16306c.getLong(m16303e7);
                    long j12 = m16306c.getLong(m16303e8);
                    long j13 = m16306c.getLong(m16303e9);
                    int i17 = m16306c.getInt(m16303e10);
                    EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                    long j14 = m16306c.getLong(m16303e12);
                    long j15 = m16306c.getLong(m16303e13);
                    int i18 = i16;
                    long j16 = m16306c.getLong(i18);
                    int i19 = m16303e;
                    int i21 = m16303e15;
                    long j17 = m16306c.getLong(i21);
                    m16303e15 = i21;
                    int i22 = m16303e16;
                    if (m16306c.getInt(i22) != 0) {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = true;
                    } else {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = false;
                    }
                    EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i11));
                    m16303e17 = i11;
                    int i23 = m16303e18;
                    int i24 = m16306c.getInt(i23);
                    m16303e18 = i23;
                    int i25 = m16303e19;
                    int i26 = m16306c.getInt(i25);
                    m16303e19 = i25;
                    int i27 = m16303e20;
                    long j18 = m16306c.getLong(i27);
                    m16303e20 = i27;
                    int i28 = m16303e21;
                    int i29 = m16306c.getInt(i28);
                    m16303e21 = i28;
                    int i31 = m16303e22;
                    int i32 = m16306c.getInt(i31);
                    m16303e22 = i31;
                    int i33 = m16303e23;
                    EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i33));
                    m16303e23 = i33;
                    int i34 = m16303e24;
                    if (m16306c.getInt(i34) != 0) {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = true;
                    } else {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = false;
                    }
                    if (m16306c.getInt(i12) != 0) {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = true;
                    } else {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = false;
                    }
                    if (m16306c.getInt(i13) != 0) {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = true;
                    } else {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = false;
                    }
                    if (m16306c.getInt(i14) != 0) {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = true;
                    } else {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = false;
                    }
                    long j19 = m16306c.getLong(i15);
                    m16303e28 = i15;
                    int i35 = m16303e29;
                    long j21 = m16306c.getLong(i35);
                    m16303e29 = i35;
                    int i36 = m16303e30;
                    if (m16306c.isNull(i36)) {
                        blob3 = null;
                    } else {
                        blob3 = m16306c.getBlob(i36);
                    }
                    C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3));
                    m16303e30 = i36;
                    arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, c2142e, i17, m138926c, j14, j15, j16, j17, z11, m138928e, i24, i26, j18, i29, i32));
                    m16303e = i19;
                    i16 = i18;
                }
                m16306c.close();
                c0089z.m406h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m16306c.close();
                c0089z.m406h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c0089z = m401c;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: B */
    public int mo138995B(String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127549k.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127549k.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: C */
    public int mo138996C(String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127548j.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127548j.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: D */
    public int mo138997D() {
        int i11 = 0;
        C0089z m401c = C0089z.m401c("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                i11 = m16306c.getInt(0);
            }
            return i11;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: E */
    public void mo138998E(String str, int i11) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127551m.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        m248b.mo220l0(2, i11);
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127551m.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: a */
    public void mo138999a(String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127545g.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127545g.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: b */
    public void mo139000b(String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127542d.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127542d.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: c */
    public List mo139001c(long j11) {
        C0089z c0089z;
        int m16303e;
        int m16303e2;
        int m16303e3;
        int m16303e4;
        int m16303e5;
        int m16303e6;
        int m16303e7;
        int m16303e8;
        int m16303e9;
        int m16303e10;
        int m16303e11;
        int m16303e12;
        int m16303e13;
        int m16303e14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        m401c.mo220l0(1, j11);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            m16303e = AbstractC3205a.m16303e(m16306c, "id");
            m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
        } catch (Throwable th2) {
            th = th2;
            c0089z = m401c;
        }
        try {
            int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
            int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
            int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
            int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
            int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
            int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
            int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
            int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
            int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
            int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
            int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
            int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
            int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
            int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
            int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
            int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
            int i16 = m16303e14;
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                if (m16306c.isNull(m16303e4)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e4);
                }
                if (m16306c.isNull(m16303e5)) {
                    blob = null;
                } else {
                    blob = m16306c.getBlob(m16303e5);
                }
                C2148h m11528g = C2148h.m11528g(blob);
                if (m16306c.isNull(m16303e6)) {
                    blob2 = null;
                } else {
                    blob2 = m16306c.getBlob(m16303e6);
                }
                C2148h m11528g2 = C2148h.m11528g(blob2);
                long j12 = m16306c.getLong(m16303e7);
                long j13 = m16306c.getLong(m16303e8);
                long j14 = m16306c.getLong(m16303e9);
                int i17 = m16306c.getInt(m16303e10);
                EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                long j15 = m16306c.getLong(m16303e12);
                long j16 = m16306c.getLong(m16303e13);
                int i18 = i16;
                long j17 = m16306c.getLong(i18);
                int i19 = m16303e;
                int i21 = m16303e15;
                long j18 = m16306c.getLong(i21);
                m16303e15 = i21;
                int i22 = m16303e16;
                if (m16306c.getInt(i22) != 0) {
                    m16303e16 = i22;
                    i11 = m16303e17;
                    z11 = true;
                } else {
                    m16303e16 = i22;
                    i11 = m16303e17;
                    z11 = false;
                }
                EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i11));
                m16303e17 = i11;
                int i23 = m16303e18;
                int i24 = m16306c.getInt(i23);
                m16303e18 = i23;
                int i25 = m16303e19;
                int i26 = m16306c.getInt(i25);
                m16303e19 = i25;
                int i27 = m16303e20;
                long j19 = m16306c.getLong(i27);
                m16303e20 = i27;
                int i28 = m16303e21;
                int i29 = m16306c.getInt(i28);
                m16303e21 = i28;
                int i31 = m16303e22;
                int i32 = m16306c.getInt(i31);
                m16303e22 = i31;
                int i33 = m16303e23;
                EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i33));
                m16303e23 = i33;
                int i34 = m16303e24;
                if (m16306c.getInt(i34) != 0) {
                    m16303e24 = i34;
                    i12 = m16303e25;
                    z12 = true;
                } else {
                    m16303e24 = i34;
                    i12 = m16303e25;
                    z12 = false;
                }
                if (m16306c.getInt(i12) != 0) {
                    m16303e25 = i12;
                    i13 = m16303e26;
                    z13 = true;
                } else {
                    m16303e25 = i12;
                    i13 = m16303e26;
                    z13 = false;
                }
                if (m16306c.getInt(i13) != 0) {
                    m16303e26 = i13;
                    i14 = m16303e27;
                    z14 = true;
                } else {
                    m16303e26 = i13;
                    i14 = m16303e27;
                    z14 = false;
                }
                if (m16306c.getInt(i14) != 0) {
                    m16303e27 = i14;
                    i15 = m16303e28;
                    z15 = true;
                } else {
                    m16303e27 = i14;
                    i15 = m16303e28;
                    z15 = false;
                }
                long j21 = m16306c.getLong(i15);
                m16303e28 = i15;
                int i35 = m16303e29;
                long j22 = m16306c.getLong(i35);
                m16303e29 = i35;
                int i36 = m16303e30;
                if (m16306c.isNull(i36)) {
                    blob3 = null;
                } else {
                    blob3 = m16306c.getBlob(i36);
                }
                C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j21, j22, C26958e0.m138925b(blob3));
                m16303e30 = i36;
                arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j12, j13, j14, c2142e, i17, m138926c, j15, j16, j17, j18, z11, m138928e, i24, i26, j19, i29, i32));
                m16303e = i19;
                i16 = i18;
            }
            m16306c.close();
            c0089z.m406h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m16306c.close();
            c0089z.m406h();
            throw th;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: d */
    public void mo139002d(String str, int i11) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127556r.m248b();
        m248b.mo220l0(1, i11);
        if (str == null) {
            m248b.mo222u0(2);
        } else {
            m248b.mo219a0(2, str);
        }
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127556r.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: e */
    public void mo139003e(C26976w c26976w) {
        this.f127539a.m341d();
        this.f127539a.m342e();
        try {
            this.f127541c.m260j(c26976w);
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: f */
    public void mo139004f(C26976w c26976w) {
        this.f127539a.m341d();
        this.f127539a.m342e();
        try {
            this.f127540b.m263j(c26976w);
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: g */
    public List mo139005g() {
        C0089z c0089z;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            int m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            int m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            int m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            int m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            int m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            int m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
            try {
                int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
                int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
                int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
                int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
                int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
                int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
                int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
                int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
                int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
                int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
                int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
                int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
                int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
                int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
                int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
                int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
                int i16 = m16303e14;
                ArrayList arrayList = new ArrayList(m16306c.getCount());
                while (m16306c.moveToNext()) {
                    if (m16306c.isNull(m16303e)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e);
                    }
                    C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        blob = null;
                    } else {
                        blob = m16306c.getBlob(m16303e5);
                    }
                    C2148h m11528g = C2148h.m11528g(blob);
                    if (m16306c.isNull(m16303e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m16306c.getBlob(m16303e6);
                    }
                    C2148h m11528g2 = C2148h.m11528g(blob2);
                    long j11 = m16306c.getLong(m16303e7);
                    long j12 = m16306c.getLong(m16303e8);
                    long j13 = m16306c.getLong(m16303e9);
                    int i17 = m16306c.getInt(m16303e10);
                    EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                    long j14 = m16306c.getLong(m16303e12);
                    long j15 = m16306c.getLong(m16303e13);
                    int i18 = i16;
                    long j16 = m16306c.getLong(i18);
                    int i19 = m16303e;
                    int i21 = m16303e15;
                    long j17 = m16306c.getLong(i21);
                    m16303e15 = i21;
                    int i22 = m16303e16;
                    if (m16306c.getInt(i22) != 0) {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = true;
                    } else {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = false;
                    }
                    EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i11));
                    m16303e17 = i11;
                    int i23 = m16303e18;
                    int i24 = m16306c.getInt(i23);
                    m16303e18 = i23;
                    int i25 = m16303e19;
                    int i26 = m16306c.getInt(i25);
                    m16303e19 = i25;
                    int i27 = m16303e20;
                    long j18 = m16306c.getLong(i27);
                    m16303e20 = i27;
                    int i28 = m16303e21;
                    int i29 = m16306c.getInt(i28);
                    m16303e21 = i28;
                    int i31 = m16303e22;
                    int i32 = m16306c.getInt(i31);
                    m16303e22 = i31;
                    int i33 = m16303e23;
                    EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i33));
                    m16303e23 = i33;
                    int i34 = m16303e24;
                    if (m16306c.getInt(i34) != 0) {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = true;
                    } else {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = false;
                    }
                    if (m16306c.getInt(i12) != 0) {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = true;
                    } else {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = false;
                    }
                    if (m16306c.getInt(i13) != 0) {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = true;
                    } else {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = false;
                    }
                    if (m16306c.getInt(i14) != 0) {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = true;
                    } else {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = false;
                    }
                    long j19 = m16306c.getLong(i15);
                    m16303e28 = i15;
                    int i35 = m16303e29;
                    long j21 = m16306c.getLong(i35);
                    m16303e29 = i35;
                    int i36 = m16303e30;
                    if (m16306c.isNull(i36)) {
                        blob3 = null;
                    } else {
                        blob3 = m16306c.getBlob(i36);
                    }
                    C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3));
                    m16303e30 = i36;
                    arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, c2142e, i17, m138926c, j14, j15, j16, j17, z11, m138928e, i24, i26, j18, i29, i32));
                    m16303e = i19;
                    i16 = i18;
                }
                m16306c.close();
                c0089z.m406h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m16306c.close();
                c0089z.m406h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c0089z = m401c;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: h */
    public List mo139006h(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(0)) {
                    string = null;
                } else {
                    string = m16306c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: i */
    public C2149h0.c mo139007i(String str) {
        Integer valueOf;
        C0089z m401c = C0089z.m401c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        C2149h0.c cVar = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(m16306c.getInt(0));
                }
                if (valueOf != null) {
                    C26958e0 c26958e0 = C26958e0.f127460a;
                    cVar = C26958e0.m138929f(valueOf.intValue());
                }
            }
            return cVar;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: j */
    public C26976w mo139008j(String str) {
        C0089z c0089z;
        int m16303e;
        int m16303e2;
        int m16303e3;
        int m16303e4;
        int m16303e5;
        int m16303e6;
        int m16303e7;
        int m16303e8;
        int m16303e9;
        int m16303e10;
        int m16303e11;
        int m16303e12;
        int m16303e13;
        int m16303e14;
        C26976w c26976w;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            m16303e = AbstractC3205a.m16303e(m16306c, "id");
            m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
        } catch (Throwable th2) {
            th = th2;
            c0089z = m401c;
        }
        try {
            int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
            int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
            int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
            int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
            int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
            int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
            int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
            int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
            int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
            int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
            int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
            int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
            int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
            int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
            int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
            int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                if (m16306c.isNull(m16303e4)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e4);
                }
                if (m16306c.isNull(m16303e5)) {
                    blob = null;
                } else {
                    blob = m16306c.getBlob(m16303e5);
                }
                C2148h m11528g = C2148h.m11528g(blob);
                if (m16306c.isNull(m16303e6)) {
                    blob2 = null;
                } else {
                    blob2 = m16306c.getBlob(m16303e6);
                }
                C2148h m11528g2 = C2148h.m11528g(blob2);
                long j11 = m16306c.getLong(m16303e7);
                long j12 = m16306c.getLong(m16303e8);
                long j13 = m16306c.getLong(m16303e9);
                int i16 = m16306c.getInt(m16303e10);
                EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                long j14 = m16306c.getLong(m16303e12);
                long j15 = m16306c.getLong(m16303e13);
                long j16 = m16306c.getLong(m16303e14);
                long j17 = m16306c.getLong(m16303e15);
                if (m16306c.getInt(m16303e16) != 0) {
                    i11 = m16303e17;
                    z11 = true;
                } else {
                    i11 = m16303e17;
                    z11 = false;
                }
                EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i11));
                int i17 = m16306c.getInt(m16303e18);
                int i18 = m16306c.getInt(m16303e19);
                long j18 = m16306c.getLong(m16303e20);
                int i19 = m16306c.getInt(m16303e21);
                int i21 = m16306c.getInt(m16303e22);
                EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(m16303e23));
                if (m16306c.getInt(m16303e24) != 0) {
                    i12 = m16303e25;
                    z12 = true;
                } else {
                    i12 = m16303e25;
                    z12 = false;
                }
                if (m16306c.getInt(i12) != 0) {
                    i13 = m16303e26;
                    z13 = true;
                } else {
                    i13 = m16303e26;
                    z13 = false;
                }
                if (m16306c.getInt(i13) != 0) {
                    i14 = m16303e27;
                    z14 = true;
                } else {
                    i14 = m16303e27;
                    z14 = false;
                }
                if (m16306c.getInt(i14) != 0) {
                    i15 = m16303e28;
                    z15 = true;
                } else {
                    i15 = m16303e28;
                    z15 = false;
                }
                long j19 = m16306c.getLong(i15);
                long j21 = m16306c.getLong(m16303e29);
                if (m16306c.isNull(m16303e30)) {
                    blob3 = null;
                } else {
                    blob3 = m16306c.getBlob(m16303e30);
                }
                c26976w = new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3)), i16, m138926c, j14, j15, j16, j17, z11, m138928e, i17, i18, j18, i19, i21);
            } else {
                c26976w = null;
            }
            m16306c.close();
            c0089z.m406h();
            return c26976w;
        } catch (Throwable th3) {
            th = th3;
            m16306c.close();
            c0089z.m406h();
            throw th;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: k */
    public int mo139009k(String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127544f.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127544f.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: l */
    public List mo139010l(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(0)) {
                    string = null;
                } else {
                    string = m16306c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: m */
    public List mo139011m(String str) {
        byte[] blob;
        C0089z m401c = C0089z.m401c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(0)) {
                    blob = null;
                } else {
                    blob = m16306c.getBlob(0);
                }
                arrayList.add(C2148h.m11528g(blob));
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: n */
    public List mo139012n(String str) {
        String string;
        byte[] blob;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte[] blob2;
        C0089z m401c = C0089z.m401c("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        this.f127539a.m342e();
        try {
            Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, true, null);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (m16306c.moveToNext()) {
                    String string2 = m16306c.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = m16306c.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                m16306c.moveToPosition(-1);
                m139026G(hashMap);
                m139025F(hashMap2);
                ArrayList arrayList = new ArrayList(m16306c.getCount());
                while (m16306c.moveToNext()) {
                    if (m16306c.isNull(0)) {
                        string = null;
                    } else {
                        string = m16306c.getString(0);
                    }
                    C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(1));
                    if (m16306c.isNull(2)) {
                        blob = null;
                    } else {
                        blob = m16306c.getBlob(2);
                    }
                    C2148h m11528g = C2148h.m11528g(blob);
                    int i11 = m16306c.getInt(3);
                    int i12 = m16306c.getInt(4);
                    long j11 = m16306c.getLong(13);
                    long j12 = m16306c.getLong(14);
                    long j13 = m16306c.getLong(15);
                    EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(16));
                    long j14 = m16306c.getLong(17);
                    long j15 = m16306c.getLong(18);
                    int i13 = m16306c.getInt(19);
                    long j16 = m16306c.getLong(20);
                    int i14 = m16306c.getInt(21);
                    EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(5));
                    if (m16306c.getInt(6) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m16306c.getInt(7) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (m16306c.getInt(8) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (m16306c.getInt(9) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    long j17 = m16306c.getLong(10);
                    long j18 = m16306c.getLong(11);
                    if (m16306c.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = m16306c.getBlob(12);
                    }
                    C2142e c2142e = new C2142e(m138927d, z11, z12, z13, z14, j17, j18, C26958e0.m138925b(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(m16306c.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(m16306c.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C26976w.c(string, m138929f, m11528g, j11, j12, j13, c2142e, i11, m138926c, j14, j15, i13, i12, j16, i14, arrayList3, arrayList4));
                }
                this.f127539a.m339E();
                m16306c.close();
                m401c.m406h();
                return arrayList;
            } catch (Throwable th2) {
                m16306c.close();
                m401c.m406h();
                throw th2;
            }
        } finally {
            this.f127539a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: o */
    public List mo139013o(int i11) {
        C0089z c0089z;
        int m16303e;
        int m16303e2;
        int m16303e3;
        int m16303e4;
        int m16303e5;
        int m16303e6;
        int m16303e7;
        int m16303e8;
        int m16303e9;
        int m16303e10;
        int m16303e11;
        int m16303e12;
        int m16303e13;
        int m16303e14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        m401c.mo220l0(1, i11);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            m16303e = AbstractC3205a.m16303e(m16306c, "id");
            m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
        } catch (Throwable th2) {
            th = th2;
            c0089z = m401c;
        }
        try {
            int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
            int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
            int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
            int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
            int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
            int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
            int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
            int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
            int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
            int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
            int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
            int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
            int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
            int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
            int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
            int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
            int i17 = m16303e14;
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                if (m16306c.isNull(m16303e4)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e4);
                }
                if (m16306c.isNull(m16303e5)) {
                    blob = null;
                } else {
                    blob = m16306c.getBlob(m16303e5);
                }
                C2148h m11528g = C2148h.m11528g(blob);
                if (m16306c.isNull(m16303e6)) {
                    blob2 = null;
                } else {
                    blob2 = m16306c.getBlob(m16303e6);
                }
                C2148h m11528g2 = C2148h.m11528g(blob2);
                long j11 = m16306c.getLong(m16303e7);
                long j12 = m16306c.getLong(m16303e8);
                long j13 = m16306c.getLong(m16303e9);
                int i18 = m16306c.getInt(m16303e10);
                EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                long j14 = m16306c.getLong(m16303e12);
                long j15 = m16306c.getLong(m16303e13);
                int i19 = i17;
                long j16 = m16306c.getLong(i19);
                int i21 = m16303e;
                int i22 = m16303e15;
                long j17 = m16306c.getLong(i22);
                m16303e15 = i22;
                int i23 = m16303e16;
                if (m16306c.getInt(i23) != 0) {
                    m16303e16 = i23;
                    i12 = m16303e17;
                    z11 = true;
                } else {
                    m16303e16 = i23;
                    i12 = m16303e17;
                    z11 = false;
                }
                EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i12));
                m16303e17 = i12;
                int i24 = m16303e18;
                int i25 = m16306c.getInt(i24);
                m16303e18 = i24;
                int i26 = m16303e19;
                int i27 = m16306c.getInt(i26);
                m16303e19 = i26;
                int i28 = m16303e20;
                long j18 = m16306c.getLong(i28);
                m16303e20 = i28;
                int i29 = m16303e21;
                int i31 = m16306c.getInt(i29);
                m16303e21 = i29;
                int i32 = m16303e22;
                int i33 = m16306c.getInt(i32);
                m16303e22 = i32;
                int i34 = m16303e23;
                EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i34));
                m16303e23 = i34;
                int i35 = m16303e24;
                if (m16306c.getInt(i35) != 0) {
                    m16303e24 = i35;
                    i13 = m16303e25;
                    z12 = true;
                } else {
                    m16303e24 = i35;
                    i13 = m16303e25;
                    z12 = false;
                }
                if (m16306c.getInt(i13) != 0) {
                    m16303e25 = i13;
                    i14 = m16303e26;
                    z13 = true;
                } else {
                    m16303e25 = i13;
                    i14 = m16303e26;
                    z13 = false;
                }
                if (m16306c.getInt(i14) != 0) {
                    m16303e26 = i14;
                    i15 = m16303e27;
                    z14 = true;
                } else {
                    m16303e26 = i14;
                    i15 = m16303e27;
                    z14 = false;
                }
                if (m16306c.getInt(i15) != 0) {
                    m16303e27 = i15;
                    i16 = m16303e28;
                    z15 = true;
                } else {
                    m16303e27 = i15;
                    i16 = m16303e28;
                    z15 = false;
                }
                long j19 = m16306c.getLong(i16);
                m16303e28 = i16;
                int i36 = m16303e29;
                long j21 = m16306c.getLong(i36);
                m16303e29 = i36;
                int i37 = m16303e30;
                if (m16306c.isNull(i37)) {
                    blob3 = null;
                } else {
                    blob3 = m16306c.getBlob(i37);
                }
                C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3));
                m16303e30 = i37;
                arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, c2142e, i18, m138926c, j14, j15, j16, j17, z11, m138928e, i25, i27, j18, i31, i33));
                m16303e = i21;
                i17 = i19;
            }
            m16306c.close();
            c0089z.m406h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m16306c.close();
            c0089z.m406h();
            throw th;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: p */
    public int mo139014p() {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127553o.m248b();
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127553o.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: q */
    public int mo139015q(String str, long j11) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127552n.m248b();
        m248b.mo220l0(1, j11);
        if (str == null) {
            m248b.mo222u0(2);
        } else {
            m248b.mo219a0(2, str);
        }
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127552n.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: r */
    public List mo139016r(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(0)) {
                    string = null;
                } else {
                    string = m16306c.getString(0);
                }
                arrayList.add(new C26976w.b(string, C26958e0.m138929f(m16306c.getInt(1))));
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: s */
    public List mo139017s(int i11) {
        C0089z c0089z;
        int m16303e;
        int m16303e2;
        int m16303e3;
        int m16303e4;
        int m16303e5;
        int m16303e6;
        int m16303e7;
        int m16303e8;
        int m16303e9;
        int m16303e10;
        int m16303e11;
        int m16303e12;
        int m16303e13;
        int m16303e14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        m401c.mo220l0(1, i11);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            m16303e = AbstractC3205a.m16303e(m16306c, "id");
            m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
        } catch (Throwable th2) {
            th = th2;
            c0089z = m401c;
        }
        try {
            int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
            int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
            int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
            int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
            int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
            int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
            int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
            int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
            int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
            int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
            int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
            int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
            int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
            int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
            int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
            int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
            int i17 = m16303e14;
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                if (m16306c.isNull(m16303e4)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e4);
                }
                if (m16306c.isNull(m16303e5)) {
                    blob = null;
                } else {
                    blob = m16306c.getBlob(m16303e5);
                }
                C2148h m11528g = C2148h.m11528g(blob);
                if (m16306c.isNull(m16303e6)) {
                    blob2 = null;
                } else {
                    blob2 = m16306c.getBlob(m16303e6);
                }
                C2148h m11528g2 = C2148h.m11528g(blob2);
                long j11 = m16306c.getLong(m16303e7);
                long j12 = m16306c.getLong(m16303e8);
                long j13 = m16306c.getLong(m16303e9);
                int i18 = m16306c.getInt(m16303e10);
                EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                long j14 = m16306c.getLong(m16303e12);
                long j15 = m16306c.getLong(m16303e13);
                int i19 = i17;
                long j16 = m16306c.getLong(i19);
                int i21 = m16303e;
                int i22 = m16303e15;
                long j17 = m16306c.getLong(i22);
                m16303e15 = i22;
                int i23 = m16303e16;
                if (m16306c.getInt(i23) != 0) {
                    m16303e16 = i23;
                    i12 = m16303e17;
                    z11 = true;
                } else {
                    m16303e16 = i23;
                    i12 = m16303e17;
                    z11 = false;
                }
                EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i12));
                m16303e17 = i12;
                int i24 = m16303e18;
                int i25 = m16306c.getInt(i24);
                m16303e18 = i24;
                int i26 = m16303e19;
                int i27 = m16306c.getInt(i26);
                m16303e19 = i26;
                int i28 = m16303e20;
                long j18 = m16306c.getLong(i28);
                m16303e20 = i28;
                int i29 = m16303e21;
                int i31 = m16306c.getInt(i29);
                m16303e21 = i29;
                int i32 = m16303e22;
                int i33 = m16306c.getInt(i32);
                m16303e22 = i32;
                int i34 = m16303e23;
                EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i34));
                m16303e23 = i34;
                int i35 = m16303e24;
                if (m16306c.getInt(i35) != 0) {
                    m16303e24 = i35;
                    i13 = m16303e25;
                    z12 = true;
                } else {
                    m16303e24 = i35;
                    i13 = m16303e25;
                    z12 = false;
                }
                if (m16306c.getInt(i13) != 0) {
                    m16303e25 = i13;
                    i14 = m16303e26;
                    z13 = true;
                } else {
                    m16303e25 = i13;
                    i14 = m16303e26;
                    z13 = false;
                }
                if (m16306c.getInt(i14) != 0) {
                    m16303e26 = i14;
                    i15 = m16303e27;
                    z14 = true;
                } else {
                    m16303e26 = i14;
                    i15 = m16303e27;
                    z14 = false;
                }
                if (m16306c.getInt(i15) != 0) {
                    m16303e27 = i15;
                    i16 = m16303e28;
                    z15 = true;
                } else {
                    m16303e27 = i15;
                    i16 = m16303e28;
                    z15 = false;
                }
                long j19 = m16306c.getLong(i16);
                m16303e28 = i16;
                int i36 = m16303e29;
                long j21 = m16306c.getLong(i36);
                m16303e29 = i36;
                int i37 = m16303e30;
                if (m16306c.isNull(i37)) {
                    blob3 = null;
                } else {
                    blob3 = m16306c.getBlob(i37);
                }
                C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3));
                m16303e30 = i37;
                arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, c2142e, i18, m138926c, j14, j15, j16, j17, z11, m138928e, i25, i27, j18, i31, i33));
                m16303e = i21;
                i17 = i19;
            }
            m16306c.close();
            c0089z.m406h();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m16306c.close();
            c0089z.m406h();
            throw th;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: t */
    public int mo139018t(C2149h0.c cVar, String str) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127543e.m248b();
        m248b.mo220l0(1, C26958e0.m138933j(cVar));
        if (str == null) {
            m248b.mo222u0(2);
        } else {
            m248b.mo219a0(2, str);
        }
        this.f127539a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f127539a.m339E();
            return mo223w;
        } finally {
            this.f127539a.m347j();
            this.f127543e.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: u */
    public void mo139019u(String str, C2148h c2148h) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127546h.m248b();
        byte[] m11529l = C2148h.m11529l(c2148h);
        if (m11529l == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo221n0(1, m11529l);
        }
        if (str == null) {
            m248b.mo222u0(2);
        } else {
            m248b.mo219a0(2, str);
        }
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127546h.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: v */
    public LiveData mo139020v(String str) {
        C0089z m401c = C0089z.m401c("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        return this.f127539a.m351n().m283d(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new k(m401c));
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: w */
    public void mo139021w(String str, long j11) {
        this.f127539a.m341d();
        InterfaceC18186k m248b = this.f127547i.m248b();
        m248b.mo220l0(1, j11);
        if (str == null) {
            m248b.mo222u0(2);
        } else {
            m248b.mo219a0(2, str);
        }
        this.f127539a.m342e();
        try {
            m248b.mo223w();
            this.f127539a.m339E();
        } finally {
            this.f127539a.m347j();
            this.f127547i.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: x */
    public List mo139022x() {
        C0089z c0089z;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        byte[] blob3;
        C0089z m401c = C0089z.m401c("SELECT * FROM workspec WHERE state=1", 0);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "state");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "worker_class_name");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "input_merger_class_name");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "input");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "output");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "initial_delay");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "interval_duration");
            int m16303e9 = AbstractC3205a.m16303e(m16306c, "flex_duration");
            int m16303e10 = AbstractC3205a.m16303e(m16306c, "run_attempt_count");
            int m16303e11 = AbstractC3205a.m16303e(m16306c, "backoff_policy");
            int m16303e12 = AbstractC3205a.m16303e(m16306c, "backoff_delay_duration");
            int m16303e13 = AbstractC3205a.m16303e(m16306c, "last_enqueue_time");
            int m16303e14 = AbstractC3205a.m16303e(m16306c, "minimum_retention_duration");
            c0089z = m401c;
            try {
                int m16303e15 = AbstractC3205a.m16303e(m16306c, "schedule_requested_at");
                int m16303e16 = AbstractC3205a.m16303e(m16306c, "run_in_foreground");
                int m16303e17 = AbstractC3205a.m16303e(m16306c, "out_of_quota_policy");
                int m16303e18 = AbstractC3205a.m16303e(m16306c, "period_count");
                int m16303e19 = AbstractC3205a.m16303e(m16306c, "generation");
                int m16303e20 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override");
                int m16303e21 = AbstractC3205a.m16303e(m16306c, "next_schedule_time_override_generation");
                int m16303e22 = AbstractC3205a.m16303e(m16306c, "stop_reason");
                int m16303e23 = AbstractC3205a.m16303e(m16306c, "required_network_type");
                int m16303e24 = AbstractC3205a.m16303e(m16306c, "requires_charging");
                int m16303e25 = AbstractC3205a.m16303e(m16306c, "requires_device_idle");
                int m16303e26 = AbstractC3205a.m16303e(m16306c, "requires_battery_not_low");
                int m16303e27 = AbstractC3205a.m16303e(m16306c, "requires_storage_not_low");
                int m16303e28 = AbstractC3205a.m16303e(m16306c, "trigger_content_update_delay");
                int m16303e29 = AbstractC3205a.m16303e(m16306c, "trigger_max_content_delay");
                int m16303e30 = AbstractC3205a.m16303e(m16306c, "content_uri_triggers");
                int i16 = m16303e14;
                ArrayList arrayList = new ArrayList(m16306c.getCount());
                while (m16306c.moveToNext()) {
                    if (m16306c.isNull(m16303e)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e);
                    }
                    C2149h0.c m138929f = C26958e0.m138929f(m16306c.getInt(m16303e2));
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        blob = null;
                    } else {
                        blob = m16306c.getBlob(m16303e5);
                    }
                    C2148h m11528g = C2148h.m11528g(blob);
                    if (m16306c.isNull(m16303e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m16306c.getBlob(m16303e6);
                    }
                    C2148h m11528g2 = C2148h.m11528g(blob2);
                    long j11 = m16306c.getLong(m16303e7);
                    long j12 = m16306c.getLong(m16303e8);
                    long j13 = m16306c.getLong(m16303e9);
                    int i17 = m16306c.getInt(m16303e10);
                    EnumC2134a m138926c = C26958e0.m138926c(m16306c.getInt(m16303e11));
                    long j14 = m16306c.getLong(m16303e12);
                    long j15 = m16306c.getLong(m16303e13);
                    int i18 = i16;
                    long j16 = m16306c.getLong(i18);
                    int i19 = m16303e;
                    int i21 = m16303e15;
                    long j17 = m16306c.getLong(i21);
                    m16303e15 = i21;
                    int i22 = m16303e16;
                    if (m16306c.getInt(i22) != 0) {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = true;
                    } else {
                        m16303e16 = i22;
                        i11 = m16303e17;
                        z11 = false;
                    }
                    EnumC2258z m138928e = C26958e0.m138928e(m16306c.getInt(i11));
                    m16303e17 = i11;
                    int i23 = m16303e18;
                    int i24 = m16306c.getInt(i23);
                    m16303e18 = i23;
                    int i25 = m16303e19;
                    int i26 = m16306c.getInt(i25);
                    m16303e19 = i25;
                    int i27 = m16303e20;
                    long j18 = m16306c.getLong(i27);
                    m16303e20 = i27;
                    int i28 = m16303e21;
                    int i29 = m16306c.getInt(i28);
                    m16303e21 = i28;
                    int i31 = m16303e22;
                    int i32 = m16306c.getInt(i31);
                    m16303e22 = i31;
                    int i33 = m16303e23;
                    EnumC2254v m138927d = C26958e0.m138927d(m16306c.getInt(i33));
                    m16303e23 = i33;
                    int i34 = m16303e24;
                    if (m16306c.getInt(i34) != 0) {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = true;
                    } else {
                        m16303e24 = i34;
                        i12 = m16303e25;
                        z12 = false;
                    }
                    if (m16306c.getInt(i12) != 0) {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = true;
                    } else {
                        m16303e25 = i12;
                        i13 = m16303e26;
                        z13 = false;
                    }
                    if (m16306c.getInt(i13) != 0) {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = true;
                    } else {
                        m16303e26 = i13;
                        i14 = m16303e27;
                        z14 = false;
                    }
                    if (m16306c.getInt(i14) != 0) {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = true;
                    } else {
                        m16303e27 = i14;
                        i15 = m16303e28;
                        z15 = false;
                    }
                    long j19 = m16306c.getLong(i15);
                    m16303e28 = i15;
                    int i35 = m16303e29;
                    long j21 = m16306c.getLong(i35);
                    m16303e29 = i35;
                    int i36 = m16303e30;
                    if (m16306c.isNull(i36)) {
                        blob3 = null;
                    } else {
                        blob3 = m16306c.getBlob(i36);
                    }
                    C2142e c2142e = new C2142e(m138927d, z12, z13, z14, z15, j19, j21, C26958e0.m138925b(blob3));
                    m16303e30 = i36;
                    arrayList.add(new C26976w(string, m138929f, string2, string3, m11528g, m11528g2, j11, j12, j13, c2142e, i17, m138926c, j14, j15, j16, j17, z11, m138928e, i24, i26, j18, i29, i32));
                    m16303e = i19;
                    i16 = i18;
                }
                m16306c.close();
                c0089z.m406h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m16306c.close();
                c0089z.m406h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c0089z = m401c;
        }
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: y */
    public LiveData mo139023y(String str) {
        C0089z m401c = C0089z.m401c("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        return this.f127539a.m351n().m283d(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new j(m401c));
    }

    @Override // p535u2.InterfaceC26977x
    /* renamed from: z */
    public boolean mo139024z() {
        boolean z11 = false;
        C0089z m401c = C0089z.m401c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f127539a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127539a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                if (m16306c.getInt(0) != 0) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
