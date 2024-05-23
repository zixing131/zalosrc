package p311l1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p311l1.C21996b;

/* renamed from: l1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC21995a extends BaseAdapter implements Filterable, C21996b.a {

    /* renamed from: p */
    protected boolean f108352p;

    /* renamed from: q */
    protected boolean f108353q;

    /* renamed from: r */
    protected Cursor f108354r;

    /* renamed from: s */
    protected Context f108355s;

    /* renamed from: t */
    protected int f108356t;

    /* renamed from: u */
    protected a f108357u;

    /* renamed from: v */
    protected DataSetObserver f108358v;

    /* renamed from: w */
    protected C21996b f108359w;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.a$a */
    /* loaded from: classes2.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            AbstractC21995a.this.m114872i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.a$b */
    /* loaded from: classes2.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC21995a abstractC21995a = AbstractC21995a.this;
            abstractC21995a.f108352p = true;
            abstractC21995a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC21995a abstractC21995a = AbstractC21995a.this;
            abstractC21995a.f108352p = false;
            abstractC21995a.notifyDataSetInvalidated();
        }
    }

    public AbstractC21995a(Context context, Cursor cursor, boolean z11) {
        int i11;
        if (z11) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        m114870f(context, cursor, i11);
    }

    /* renamed from: a */
    public void mo5668a(Cursor cursor) {
        Cursor m114873j = m114873j(cursor);
        if (m114873j != null) {
            m114873j.close();
        }
    }

    /* renamed from: b */
    public abstract CharSequence mo5669b(Cursor cursor);

    @Override // p311l1.C21996b.a
    /* renamed from: d */
    public Cursor mo114869d() {
        return this.f108354r;
    }

    /* renamed from: e */
    public abstract void mo5671e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m114870f(Context context, Cursor cursor, int i11) {
        int i12;
        boolean z11 = false;
        if ((i11 & 1) == 1) {
            i11 |= 2;
            this.f108353q = true;
        } else {
            this.f108353q = false;
        }
        if (cursor != null) {
            z11 = true;
        }
        this.f108354r = cursor;
        this.f108352p = z11;
        this.f108355s = context;
        if (z11) {
            i12 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i12 = -1;
        }
        this.f108356t = i12;
        if ((i11 & 2) == 2) {
            this.f108357u = new a();
            this.f108358v = new b();
        } else {
            this.f108357u = null;
            this.f108358v = null;
        }
        if (z11) {
            a aVar = this.f108357u;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f108358v;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo114871g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f108352p && (cursor = this.f108354r) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (this.f108352p) {
            this.f108354r.moveToPosition(i11);
            if (view == null) {
                view = mo114871g(this.f108355s, this.f108354r, viewGroup);
            }
            mo5671e(view, this.f108355s, this.f108354r);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f108359w == null) {
            this.f108359w = new C21996b(this);
        }
        return this.f108359w;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        Cursor cursor;
        if (this.f108352p && (cursor = this.f108354r) != null) {
            cursor.moveToPosition(i11);
            return this.f108354r;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        Cursor cursor;
        if (!this.f108352p || (cursor = this.f108354r) == null || !cursor.moveToPosition(i11)) {
            return 0L;
        }
        return this.f108354r.getLong(this.f108356t);
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (this.f108352p) {
            if (this.f108354r.moveToPosition(i11)) {
                if (view == null) {
                    view = mo5672h(this.f108355s, this.f108354r, viewGroup);
                }
                mo5671e(view, this.f108355s, this.f108354r);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i11);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo5672h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m114872i() {
        Cursor cursor;
        if (this.f108353q && (cursor = this.f108354r) != null && !cursor.isClosed()) {
            this.f108352p = this.f108354r.requery();
        }
    }

    /* renamed from: j */
    public Cursor m114873j(Cursor cursor) {
        Cursor cursor2 = this.f108354r;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f108357u;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f108358v;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f108354r = cursor;
        if (cursor != null) {
            a aVar2 = this.f108357u;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f108358v;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f108356t = cursor.getColumnIndexOrThrow("_id");
            this.f108352p = true;
            notifyDataSetChanged();
        } else {
            this.f108356t = -1;
            this.f108352p = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
