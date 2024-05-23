package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.adapters.y0 */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC7267y0 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: q */
    private final LayoutInflater f39858q;

    /* renamed from: r */
    private final Context f39859r;

    /* renamed from: s */
    private final C23528a f39860s;

    /* renamed from: t */
    private final C24003n f39861t;

    /* renamed from: u */
    private final a f39862u;

    /* renamed from: v */
    private int f39863v;

    /* renamed from: p */
    private List f39857p = new ArrayList();

    /* renamed from: w */
    private boolean f39864w = false;

    /* renamed from: com.zing.zalo.adapters.y0$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo37023a(FolderItem folderItem, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.y0$b */
    /* loaded from: classes3.dex */
    private static class b {

        /* renamed from: a */
        int f39865a;

        /* renamed from: b */
        FolderItem f39866b;

        /* renamed from: c */
        RoundedImageView f39867c;

        /* renamed from: d */
        TextView f39868d;

        /* renamed from: e */
        TextView f39869e;

        /* renamed from: f */
        AppCompatImageView f39870f;

        /* renamed from: g */
        View f39871g;

        private b() {
        }
    }

    public ViewOnClickListenerC7267y0(Context context, a aVar) {
        this.f39858q = LayoutInflater.from(context);
        this.f39859r = context;
        this.f39860s = new C23528a(context);
        C24003n c24003n = new C24003n();
        this.f39861t = c24003n;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116260a = AbstractC23006a0.m117883M();
        c24003n.f116262c = AbstractC23006a0.f111912c;
        c24003n.f116266g = C23278z2.m120110a();
        this.f39862u = aVar;
    }

    /* renamed from: a */
    private FolderItem m37019a(int i11) {
        if (i11 >= 0 && i11 < this.f39857p.size()) {
            return (FolderItem) this.f39857p.get(i11);
        }
        return null;
    }

    /* renamed from: b */
    public void m37020b(List list) {
        if (list != null) {
            this.f39857p = new ArrayList(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public void m37021c(boolean z11) {
        this.f39864w = z11;
    }

    /* renamed from: d */
    public void m37022d(int i11) {
        this.f39863v = i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39857p.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39857p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        b bVar;
        String str;
        int i12;
        try {
            if (view == null) {
                bVar = new b();
                View inflate = this.f39858q.inflate(AbstractC7409c0.folder_menu_popup_item, viewGroup, false);
                bVar.f39867c = (RoundedImageView) inflate.findViewById(AbstractC6918a0.image_view);
                bVar.f39868d = (TextView) inflate.findViewById(AbstractC6918a0.media_grid_item_folder_name);
                bVar.f39869e = (TextView) inflate.findViewById(AbstractC6918a0.media_grid_item_folder_num_photos);
                bVar.f39870f = (AppCompatImageView) inflate.findViewById(AbstractC6918a0.icon_selected);
                bVar.f39871g = inflate.findViewById(AbstractC6918a0.anchor_top);
                inflate.setOnClickListener(this);
                inflate.setTag(bVar);
                try {
                    inflate.setTag(bVar);
                    view = inflate;
                } catch (Exception e11) {
                    e = e11;
                    view = inflate;
                    e.printStackTrace();
                    return view;
                }
            } else {
                bVar = (b) view.getTag();
            }
            bVar.f39865a = i11;
            bVar.f39866b = m37019a(i11);
            bVar.f39867c.setTag(String.format("image#%s", Integer.valueOf(i11)));
            String mo41083a0 = bVar.f39866b.mo41083a0();
            if (!C23999j.m125696L2(mo41083a0, this.f39861t) && viewGroup != null && this.f39864w) {
                bVar.f39867c.setImageDrawable(AbstractC23136l9.m118665N(this.f39859r, AbstractC16803z.chat_icloud_default));
            } else {
                ((C23528a) this.f39860s.m123612r(bVar.f39867c)).m123618x(mo41083a0, this.f39861t);
            }
            TextView textView = bVar.f39868d;
            if (!TextUtils.isEmpty(bVar.f39866b.m41087u1())) {
                str = bVar.f39866b.m41087u1();
            } else {
                str = "";
            }
            textView.setText(str);
            bVar.f39869e.setVisibility(0);
            bVar.f39869e.setText(String.valueOf(bVar.f39866b.m41088v1()));
            AppCompatImageView appCompatImageView = bVar.f39870f;
            if (i11 == this.f39863v) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            appCompatImageView.setVisibility(i12);
            if (i11 == 0) {
                bVar.f39871g.setVisibility(0);
            }
        } catch (Exception e12) {
            e = e12;
        }
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            b bVar = (b) view.getTag();
            a aVar = this.f39862u;
            if (aVar != null) {
                aVar.mo37023a(bVar.f39866b, bVar.f39865a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
