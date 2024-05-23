package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.AbstractC1327c;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p145f0.AbstractC18683a;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f3596a = new Random();

    /* renamed from: b */
    private final Map f3597b = new HashMap();

    /* renamed from: c */
    final Map f3598c = new HashMap();

    /* renamed from: d */
    private final Map f3599d = new HashMap();

    /* renamed from: e */
    ArrayList f3600e = new ArrayList();

    /* renamed from: f */
    final transient Map f3601f = new HashMap();

    /* renamed from: g */
    final Map f3602g = new HashMap();

    /* renamed from: h */
    final Bundle f3603h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes2.dex */
    class C1017a extends AbstractC1023b {

        /* renamed from: a */
        final /* synthetic */ String f3608a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18683a f3609b;

        C1017a(String str, AbstractC18683a abstractC18683a) {
            this.f3608a = str;
            this.f3609b = abstractC18683a;
        }

        @Override // androidx.activity.result.AbstractC1023b
        /* renamed from: b */
        public void mo4682b(Object obj, AbstractC1327c abstractC1327c) {
            Integer num = (Integer) ActivityResultRegistry.this.f3598c.get(this.f3608a);
            if (num != null) {
                ActivityResultRegistry.this.f3600e.add(this.f3608a);
                try {
                    ActivityResultRegistry.this.mo4653e(num.intValue(), this.f3609b, obj, abstractC1327c);
                    return;
                } catch (Exception e11) {
                    ActivityResultRegistry.this.f3600e.remove(this.f3608a);
                    throw e11;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f3609b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes2.dex */
    public static class C1018b {

        /* renamed from: a */
        final InterfaceC1022a f3611a;

        /* renamed from: b */
        final AbstractC18683a f3612b;

        C1018b(InterfaceC1022a interfaceC1022a, AbstractC18683a abstractC18683a) {
            this.f3611a = interfaceC1022a;
            this.f3612b = abstractC18683a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes2.dex */
    public static class C1019c {

        /* renamed from: a */
        final AbstractC1785o f3613a;

        /* renamed from: b */
        private final ArrayList f3614b = new ArrayList();

        C1019c(AbstractC1785o abstractC1785o) {
            this.f3613a = abstractC1785o;
        }

        /* renamed from: a */
        void m4683a(InterfaceC1795t interfaceC1795t) {
            this.f3613a.mo9335a(interfaceC1795t);
            this.f3614b.add(interfaceC1795t);
        }

        /* renamed from: b */
        void m4684b() {
            Iterator it = this.f3614b.iterator();
            while (it.hasNext()) {
                this.f3613a.mo9338d((InterfaceC1795t) it.next());
            }
            this.f3614b.clear();
        }
    }

    /* renamed from: a */
    private void m4673a(int i11, String str) {
        this.f3597b.put(Integer.valueOf(i11), str);
        this.f3598c.put(str, Integer.valueOf(i11));
    }

    /* renamed from: c */
    private void m4674c(String str, int i11, Intent intent, C1018b c1018b) {
        if (c1018b != null && c1018b.f3611a != null && this.f3600e.contains(str)) {
            c1018b.f3611a.mo4692a(c1018b.f3612b.mo98588c(i11, intent));
            this.f3600e.remove(str);
        } else {
            this.f3602g.remove(str);
            this.f3603h.putParcelable(str, new ActivityResult(i11, intent));
        }
    }

    /* renamed from: d */
    private int m4675d() {
        int nextInt = this.f3596a.nextInt(2147418112);
        while (true) {
            int i11 = nextInt + 65536;
            if (this.f3597b.containsKey(Integer.valueOf(i11))) {
                nextInt = this.f3596a.nextInt(2147418112);
            } else {
                return i11;
            }
        }
    }

    /* renamed from: i */
    private void m4676i(String str) {
        if (((Integer) this.f3598c.get(str)) != null) {
            return;
        }
        m4673a(m4675d(), str);
    }

    /* renamed from: b */
    public final boolean m4677b(int i11, int i12, Intent intent) {
        String str = (String) this.f3597b.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        m4674c(str, i12, intent, (C1018b) this.f3601f.get(str));
        return true;
    }

    /* renamed from: e */
    public abstract void mo4653e(int i11, AbstractC18683a abstractC18683a, Object obj, AbstractC1327c abstractC1327c);

    /* renamed from: f */
    public final void m4678f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f3600e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f3596a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.f3603h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                String str = stringArrayList.get(i11);
                if (this.f3598c.containsKey(str)) {
                    Integer num = (Integer) this.f3598c.remove(str);
                    if (!this.f3603h.containsKey(str)) {
                        this.f3597b.remove(num);
                    }
                }
                m4673a(integerArrayList.get(i11).intValue(), stringArrayList.get(i11));
            }
        }
    }

    /* renamed from: g */
    public final void m4679g(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f3598c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f3598c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f3600e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f3603h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f3596a);
    }

    /* renamed from: h */
    public final AbstractC1023b m4680h(final String str, InterfaceC1801w interfaceC1801w, final AbstractC18683a abstractC18683a, final InterfaceC1022a interfaceC1022a) {
        AbstractC1785o lifecycle = interfaceC1801w.getLifecycle();
        if (!lifecycle.mo9336b().m9345c(AbstractC1785o.b.STARTED)) {
            m4676i(str);
            C1019c c1019c = (C1019c) this.f3599d.get(str);
            if (c1019c == null) {
                c1019c = new C1019c(lifecycle);
            }
            c1019c.m4683a(new InterfaceC1795t() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w2, AbstractC1785o.a aVar) {
                    if (AbstractC1785o.a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f3601f.put(str, new C1018b(interfaceC1022a, abstractC18683a));
                        if (ActivityResultRegistry.this.f3602g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f3602g.get(str);
                            ActivityResultRegistry.this.f3602g.remove(str);
                            interfaceC1022a.mo4692a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f3603h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f3603h.remove(str);
                            interfaceC1022a.mo4692a(abstractC18683a.mo98588c(activityResult.m4670b(), activityResult.m4669a()));
                            return;
                        }
                        return;
                    }
                    if (AbstractC1785o.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f3601f.remove(str);
                    } else if (AbstractC1785o.a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.m4681j(str);
                    }
                }
            });
            this.f3599d.put(str, c1019c);
            return new C1017a(str, abstractC18683a);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC1801w + " is attempting to register while current state is " + lifecycle.mo9336b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: j */
    final void m4681j(String str) {
        Integer num;
        if (!this.f3600e.contains(str) && (num = (Integer) this.f3598c.remove(str)) != null) {
            this.f3597b.remove(num);
        }
        this.f3601f.remove(str);
        if (this.f3602g.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f3602g.get(str));
            this.f3602g.remove(str);
        }
        if (this.f3603h.containsKey(str)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Dropping pending result for request ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(this.f3603h.getParcelable(str));
            this.f3603h.remove(str);
        }
        C1019c c1019c = (C1019c) this.f3599d.get(str);
        if (c1019c != null) {
            c1019c.m4684b();
            this.f3599d.remove(str);
        }
    }
}
