package v20;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.C2343e;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23028c0;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;

/* renamed from: v20.t */
/* loaded from: classes5.dex */
public class C27492t extends BaseAdapter {

    /* renamed from: p */
    ArrayList f129303p;

    /* renamed from: q */
    public InterfaceC27218a f129304q;

    /* renamed from: r */
    b f129305r;

    /* renamed from: s */
    public LayoutInflater f129306s;

    /* renamed from: t */
    C23528a f129307t;

    /* renamed from: u */
    String f129308u;

    /* renamed from: v */
    a f129309v;

    /* renamed from: w */
    int f129310w;

    /* renamed from: x */
    TrackingSource f129311x;

    /* renamed from: v20.t$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo87358a(LikeContactItem likeContactItem);
    }

    /* renamed from: v20.t$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: Gj */
        void mo84999Gj(LikeContactItem likeContactItem, TrackingSource trackingSource);

        /* renamed from: n2 */
        InterfaceC27218a m140592n2();
    }

    /* renamed from: v20.t$c */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a */
        public RecyclingImageView f129312a;

        /* renamed from: b */
        public TextView f129313b;

        /* renamed from: c */
        public LinearLayout f129314c;

        /* renamed from: d */
        public View f129315d;
    }

    public C27492t(int i11, b bVar, String str, a aVar, TrackingSource trackingSource) {
        InterfaceC27218a m140592n2 = bVar.m140592n2();
        this.f129304q = m140592n2;
        this.f129307t = new C23528a(m140592n2.getContext());
        this.f129306s = (LayoutInflater) this.f129304q.getContext().getSystemService("layout_inflater");
        this.f129308u = str;
        this.f129309v = aVar;
        this.f129310w = i11;
        this.f129311x = trackingSource;
        this.f129305r = bVar;
    }

    /* renamed from: c */
    private void m140587c(c cVar, final LikeContactItem likeContactItem) {
        cVar.f129314c.setOnClickListener(new View.OnClickListener() { // from class: v20.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27492t.this.m140588d(likeContactItem, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m140588d(LikeContactItem likeContactItem, View view) {
        this.f129305r.mo84999Gj(likeContactItem, this.f129311x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m140589e(LikeContactItem likeContactItem, View view) {
        try {
            a aVar = this.f129309v;
            if (aVar != null && likeContactItem != null) {
                aVar.mo87358a(likeContactItem);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m140590f(String str) {
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str) && (arrayList = this.f129303p) != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    if (likeContactItem != null && likeContactItem.m56333d().equals(str)) {
                        it.remove();
                        notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public void m140591g(ArrayList arrayList) {
        this.f129303p = new ArrayList(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f129303p;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f129303p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        c cVar;
        if (view == null) {
            cVar = new c();
            view2 = this.f129306s.inflate(AbstractC7409c0.tagcontact_row, (ViewGroup) null);
            cVar.f129312a = (RecyclingImageView) view2.findViewById(AbstractC6918a0.likeContactAvatar);
            cVar.f129313b = (TextView) view2.findViewById(AbstractC6918a0.likeContactName);
            cVar.f129314c = (LinearLayout) view2.findViewById(AbstractC6918a0.info_contact_row);
            cVar.f129315d = view2.findViewById(AbstractC6918a0.remove_tag_button);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (c) view.getTag();
        }
        final LikeContactItem likeContactItem = (LikeContactItem) this.f129303p.get(i11);
        cVar.f129312a.setImageResource(AbstractC16803z.default_avatar);
        if (likeContactItem.m56330a() != null) {
            if (C23302b.f113247a.m120523d(likeContactItem.m56330a()) && !CoreUtility.f89233i.equals(likeContactItem.m56333d())) {
                int m12307a = C2343e.m12307a(likeContactItem.m56333d(), false);
                cVar.f129312a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(likeContactItem.m56331b()), m12307a));
            } else {
                ((C23528a) this.f129307t.m123612r(cVar.f129312a)).m123618x(likeContactItem.m56330a(), C23278z2.m120143n());
            }
        }
        cVar.f129313b.setText(likeContactItem.m56331b());
        int i12 = this.f129310w;
        if (i12 != 4 && i12 != 5) {
            m140587c(cVar, likeContactItem);
        }
        int i13 = this.f129310w;
        if (i13 != 3 && i13 != 5) {
            if (likeContactItem.m56333d().equals(CoreUtility.f89233i)) {
                cVar.f129315d.setVisibility(0);
            } else if (!AbstractC25495a.m132077b(likeContactItem.m56333d()) && !likeContactItem.m56333d().equals("-1")) {
                if (this.f129308u.equals(CoreUtility.f89233i)) {
                    cVar.f129315d.setVisibility(0);
                } else {
                    cVar.f129315d.setVisibility(8);
                }
            } else {
                cVar.f129315d.setVisibility(8);
            }
        } else {
            cVar.f129315d.setVisibility(8);
        }
        cVar.f129315d.setOnClickListener(new View.OnClickListener() { // from class: v20.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C27492t.this.m140589e(likeContactItem, view3);
            }
        });
        return view2;
    }
}
