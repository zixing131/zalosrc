package androidx.databinding;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class MergedDataBinderMapper extends AbstractC1671e {

    /* renamed from: a */
    private Set f6683a = new HashSet();

    /* renamed from: b */
    private List f6684b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List f6685c = new CopyOnWriteArrayList();

    /* renamed from: f */
    private boolean m8461f() {
        boolean z11 = false;
        for (String str : this.f6685c) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC1671e.class.isAssignableFrom(cls)) {
                    m8464d((AbstractC1671e) cls.newInstance());
                    this.f6685c.remove(str);
                    z11 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(str);
            } catch (InstantiationException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unable to add feature mapper for ");
                sb3.append(str);
            }
        }
        return z11;
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: b */
    public ViewDataBinding mo8462b(InterfaceC1672f interfaceC1672f, View view, int i11) {
        Iterator it = this.f6684b.iterator();
        while (it.hasNext()) {
            ViewDataBinding mo8462b = ((AbstractC1671e) it.next()).mo8462b(interfaceC1672f, view, i11);
            if (mo8462b != null) {
                return mo8462b;
            }
        }
        if (m8461f()) {
            return mo8462b(interfaceC1672f, view, i11);
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: c */
    public ViewDataBinding mo8463c(InterfaceC1672f interfaceC1672f, View[] viewArr, int i11) {
        Iterator it = this.f6684b.iterator();
        while (it.hasNext()) {
            ViewDataBinding mo8463c = ((AbstractC1671e) it.next()).mo8463c(interfaceC1672f, viewArr, i11);
            if (mo8463c != null) {
                return mo8463c;
            }
        }
        if (m8461f()) {
            return mo8463c(interfaceC1672f, viewArr, i11);
        }
        return null;
    }

    /* renamed from: d */
    public void m8464d(AbstractC1671e abstractC1671e) {
        if (this.f6683a.add(abstractC1671e.getClass())) {
            this.f6684b.add(abstractC1671e);
            Iterator it = abstractC1671e.mo8549a().iterator();
            while (it.hasNext()) {
                m8464d((AbstractC1671e) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m8465e(String str) {
        this.f6685c.add(str + ".DataBinderMapperImpl");
    }
}
