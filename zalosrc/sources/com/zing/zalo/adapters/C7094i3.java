package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.loginhistory.LoginDeviceItemModuleView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import me0.AbstractC23268y2;
import me0.C23212s8;
import p716zh.C32077q6;

/* renamed from: com.zing.zalo.adapters.i3 */
/* loaded from: classes3.dex */
public class C7094i3 extends BaseAdapter {

    /* renamed from: p */
    LayoutInflater f38778p;

    /* renamed from: q */
    Context f38779q;

    /* renamed from: r */
    a f38780r;

    /* renamed from: s */
    ArrayList f38781s;

    /* renamed from: com.zing.zalo.adapters.i3$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: F4 */
        void mo36171F4(C32077q6 c32077q6);

        /* renamed from: Ky */
        void mo36172Ky(C32077q6 c32077q6);

        Context getContext();

        /* renamed from: w */
        void mo36173w(ContactProfile contactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.i3$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public final LoginDeviceItemModuleView f38782a;

        public b(LoginDeviceItemModuleView loginDeviceItemModuleView) {
            this.f38782a = loginDeviceItemModuleView;
        }

        /* renamed from: a */
        public void m36174a(C32077q6 c32077q6, boolean z11, int i11) {
            this.f38782a.m69762X(c32077q6, z11, i11);
        }
    }

    /* renamed from: com.zing.zalo.adapters.i3$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public RobotoTextView f38783a;

        /* renamed from: b */
        public GroupAvatarView f38784b;
    }

    public C7094i3(a aVar) {
        Context context = aVar.getContext();
        this.f38779q = context;
        this.f38778p = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38780r = aVar;
    }

    /* renamed from: c */
    public /* synthetic */ void m36168c(C32077q6 c32077q6, View view) {
        a aVar = this.f38780r;
        if (aVar != null) {
            aVar.mo36173w(c32077q6.f147716i);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public C32077q6 getItem(int i11) {
        ArrayList arrayList = this.f38781s;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C32077q6) this.f38781s.get(i11);
        }
        return null;
    }

    /* renamed from: d */
    public void m36170d(ArrayList arrayList) {
        this.f38781s = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38781s;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        C32077q6 item = getItem(i11);
        if (item != null) {
            return item.f147715h;
        }
        return C32077q6.f147699C;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        c cVar;
        b bVar;
        try {
            C32077q6 item = getItem(i11);
            if (item.f147715h == C32077q6.f147697A) {
                if (view == null) {
                    bVar = new b(new LoginDeviceItemModuleView(this.f38779q, this.f38780r));
                    view = bVar.f38782a;
                    view.setTag(bVar);
                } else {
                    bVar = (b) view.getTag();
                }
                bVar.m36174a(item, false, i11);
            } else {
                if (view == null) {
                    cVar = new c();
                    int i12 = item.f147715h;
                    if (i12 == C32077q6.f147699C) {
                        view = this.f38778p.inflate(AbstractC7409c0.seperate_list_global_search, (ViewGroup) null);
                    } else if (i12 == C32077q6.f147698B) {
                        view = this.f38778p.inflate(AbstractC7409c0.header_row_global_search, (ViewGroup) null);
                        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.title_label);
                        cVar.f38783a = robotoTextView;
                        robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.TextColor5));
                    } else if (i12 == C32077q6.f147700D) {
                        view = this.f38778p.inflate(AbstractC7409c0.item_share_file_login_pc, (ViewGroup) null);
                        cVar.f38783a = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
                        cVar.f38784b = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
                    } else {
                        view = new View(viewGroup.getContext());
                    }
                    view.setTag(cVar);
                } else {
                    cVar = (c) view.getTag();
                }
                int i13 = item.f147715h;
                if (i13 == C32077q6.f147698B) {
                    cVar.f38783a.setText(item.f147708a);
                } else if (i13 == C32077q6.f147700D) {
                    if (item.f147716i != null) {
                        cVar.f38783a.setText(item.f147708a);
                        AbstractC23268y2.m120027a(cVar.f38784b, item.f147716i, false);
                    }
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.h3

                        /* renamed from: q */
                        public final /* synthetic */ C32077q6 f38726q;

                        public /* synthetic */ ViewOnClickListenerC7083h3(C32077q6 item2) {
                            r2 = item2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C7094i3.this.m36168c(r2, view2);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return C32077q6.f147707z;
    }
}
