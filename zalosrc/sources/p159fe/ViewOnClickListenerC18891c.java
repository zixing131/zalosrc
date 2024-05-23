package p159fe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ge.C19424p;
import ge.C19427s;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;

/* renamed from: fe.c */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC18891c extends BaseAdapter implements View.OnClickListener {

    /* renamed from: p */
    Context f94316p;

    /* renamed from: s */
    public C19424p f94319s;

    /* renamed from: q */
    ArrayList f94317q = new ArrayList();

    /* renamed from: r */
    public int f94318r = 0;

    /* renamed from: t */
    LayoutInflater f94320t = null;

    /* renamed from: fe.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public ImageView f94321a;

        /* renamed from: b */
        public RobotoTextView f94322b;

        /* renamed from: c */
        public ImageView f94323c;
    }

    public ViewOnClickListenerC18891c(Context context, int i11, C19424p c19424p) {
        this.f94316p = context;
        if (c19424p != null) {
            this.f94319s = c19424p.clone();
        } else {
            this.f94319s = new C19424p();
        }
        m99048b(i11);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C19427s getItem(int i11) {
        return (C19427s) this.f94317q.get(i11);
    }

    /* renamed from: b */
    public void m99048b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (this.f94319s.f96371b.size() == 0) {
                        this.f94319s.f96371b.add(5);
                        this.f94319s.f96371b.add(6);
                        this.f94319s.f96371b.add(7);
                        this.f94319s.f96371b.add(8);
                        this.f94319s.f96371b.add(9);
                    }
                    this.f94317q.clear();
                    this.f94317q.add(new C19427s(5));
                    this.f94317q.add(new C19427s(6));
                    this.f94317q.add(new C19427s(7));
                    this.f94317q.add(new C19427s(8));
                    this.f94317q.add(new C19427s(9));
                    this.f94317q.add(new C19427s(10));
                    this.f94317q.add(new C19427s(11));
                    notifyDataSetChanged();
                }
            } else {
                this.f94319s.f96375f = 1;
                this.f94317q.clear();
                this.f94317q.add(new C19427s(-1));
                this.f94317q.add(new C19427s(0));
                this.f94317q.add(new C19427s(1));
                this.f94317q.add(new C19427s(4));
                this.f94317q.add(new C19427s(2));
                this.f94317q.add(new C19427s(3));
                notifyDataSetChanged();
            }
        } else {
            this.f94319s.f96375f = 0;
            this.f94317q.clear();
            this.f94317q.add(new C19427s(-1));
            this.f94317q.add(new C19427s(0));
            this.f94317q.add(new C19427s(1));
            this.f94317q.add(new C19427s(4));
            this.f94317q.add(new C19427s(2));
            this.f94317q.add(new C19427s(3));
            notifyDataSetChanged();
        }
        this.f94318r = i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94317q.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        C19427s item = getItem(i11);
        if (view == null) {
            if (this.f94320t == null) {
                this.f94320t = LayoutInflater.from(this.f94316p);
            }
            view = this.f94320t.inflate(AbstractC7409c0.reminder_repeat_type_item_layout, viewGroup, false);
            aVar = new a();
            aVar.f94321a = (ImageView) view.findViewById(AbstractC6918a0.repeat_type_select_checker);
            aVar.f94322b = (RobotoTextView) view.findViewById(AbstractC6918a0.repeat_type_name);
            aVar.f94323c = (ImageView) view.findViewById(AbstractC6918a0.repeat_type_forward);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        int i12 = this.f94318r;
        if (i12 != 0 && i12 != 1) {
            if (i12 == 2) {
                if (this.f94319s.f96371b.contains(Integer.valueOf(item.f96381a))) {
                    ImageView imageView = aVar.f94321a;
                    imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), AbstractC16803z.icn_form_radio_checked));
                } else {
                    ImageView imageView2 = aVar.f94321a;
                    imageView2.setImageDrawable(AbstractC23136l9.m118665N(imageView2.getContext(), AbstractC16803z.icn_form_radio_unchecked));
                }
                switch (item.f96381a) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        aVar.f94322b.setText(AbstractC23136l9.m118755v0(AbstractC16775v.array_days_of_week_full)[(item.f96381a - 4) % 7]);
                        aVar.f94323c.setVisibility(8);
                    default:
                        return view;
                }
            }
        } else {
            if (this.f94319s.f96370a == item.f96381a) {
                ImageView imageView3 = aVar.f94321a;
                imageView3.setImageDrawable(AbstractC23136l9.m118665N(imageView3.getContext(), AbstractC16803z.icn_form_radio_checked));
            } else {
                ImageView imageView4 = aVar.f94321a;
                imageView4.setImageDrawable(AbstractC23136l9.m118665N(imageView4.getContext(), AbstractC16803z.icn_form_radio_unchecked));
            }
            int i13 = item.f96381a;
            if (i13 != -1) {
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    C19424p c19424p = this.f94319s;
                                    if (c19424p != null && c19424p.f96371b.size() > 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        if (this.f94319s.f96371b.size() == 7) {
                                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_weekly_all));
                                        } else {
                                            StringBuilder sb3 = new StringBuilder();
                                            Iterator it = this.f94319s.f96371b.iterator();
                                            while (it.hasNext()) {
                                                sb3.append(AbstractC23136l9.m118755v0(AbstractC16775v.array_days_of_week_short)[(((Integer) it.next()).intValue() - 4) % 7]);
                                                sb3.append(", ");
                                            }
                                            sb3.delete(sb3.length() - 2, sb3.length());
                                            sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_weekly_custom), sb3.toString()));
                                        }
                                        aVar.f94322b.setText(sb2.toString());
                                    } else {
                                        aVar.f94322b.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_weekly_custom));
                                    }
                                    aVar.f94323c.setVisibility(0);
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_yearly));
                                if (this.f94318r == 1) {
                                    sb4.append(" ");
                                    sb4.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lunisolar_calendar_postfix));
                                }
                                aVar.f94322b.setText(sb4);
                                aVar.f94323c.setVisibility(8);
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_monthly));
                            if (this.f94318r == 1) {
                                sb5.append(" ");
                                sb5.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lunisolar_calendar_postfix));
                            }
                            aVar.f94322b.setText(sb5);
                            aVar.f94323c.setVisibility(8);
                        }
                    } else {
                        aVar.f94322b.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_weekly));
                        aVar.f94323c.setVisibility(8);
                    }
                } else {
                    aVar.f94322b.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_daily));
                    aVar.f94323c.setVisibility(8);
                }
            } else {
                aVar.f94322b.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_none));
                aVar.f94323c.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }
}
