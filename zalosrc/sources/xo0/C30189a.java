package xo0;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.Iterator;
import ko0.C21790e;
import me0.AbstractC23262x6;

/* renamed from: xo0.a */
/* loaded from: classes7.dex */
public class C30189a extends Thread {

    /* renamed from: p */
    private final String f140230p;

    /* renamed from: q */
    private final ArrayList f140231q;

    /* renamed from: r */
    private final a f140232r;

    /* renamed from: xo0.a$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo145508a();

        /* renamed from: b */
        void mo145509b(ArrayList arrayList);
    }

    public C30189a(String str, ArrayList arrayList, a aVar) {
        super("Z:SearchMemberTask");
        this.f140230p = str;
        this.f140231q = arrayList;
        this.f140232r = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ContactProfile contactProfile;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(this.f140230p)) {
                a aVar = this.f140232r;
                if (aVar != null) {
                    aVar.mo145508a();
                    return;
                }
                return;
            }
            String m120002o = AbstractC23262x6.m120002o(this.f140230p);
            Iterator it = this.f140231q.iterator();
            while (it.hasNext()) {
                C21790e c21790e = (C21790e) it.next();
                if (c21790e.f105765b == 0 && !arrayList.contains(c21790e) && (contactProfile = c21790e.f105764a) != null) {
                    String str = contactProfile.f42440t;
                    if (!TextUtils.isEmpty(str) && str.contains(m120002o)) {
                        c21790e.f105764a.f42399a1.clear();
                        int indexOf = str.indexOf(m120002o);
                        if (indexOf != -1) {
                            int length = m120002o.length() + indexOf;
                            c21790e.f105764a.f42399a1.add(Integer.valueOf(indexOf));
                            c21790e.f105764a.f42399a1.add(Integer.valueOf(length));
                        }
                        arrayList.add(c21790e);
                    }
                }
            }
            a aVar2 = this.f140232r;
            if (aVar2 != null) {
                aVar2.mo145509b(arrayList);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
