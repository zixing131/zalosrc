package p379o3;

import java.io.Closeable;
import java.io.File;
import java.util.Date;
import p620wt.AbstractC29237l;

/* renamed from: o3.f */
/* loaded from: classes.dex */
public class C23995f {

    /* renamed from: d */
    private String f116179d;

    /* renamed from: e */
    private byte[] f116180e;

    /* renamed from: f */
    private File f116181f;

    /* renamed from: h */
    private boolean f116183h;

    /* renamed from: i */
    private long f116184i;

    /* renamed from: l */
    private boolean f116187l;

    /* renamed from: m */
    private boolean f116188m;

    /* renamed from: n */
    private boolean f116189n;

    /* renamed from: p */
    private String f116191p;

    /* renamed from: q */
    private Closeable f116192q;

    /* renamed from: r */
    private boolean f116193r;

    /* renamed from: a */
    private int f116176a = 200;

    /* renamed from: b */
    private int f116177b = 200;

    /* renamed from: c */
    private String f116178c = "OK";

    /* renamed from: g */
    private Date f116182g = new Date();

    /* renamed from: j */
    private int f116185j = 1;

    /* renamed from: k */
    private final long f116186k = System.currentTimeMillis();

    /* renamed from: o */
    private int f116190o = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C23995f m125647A(int i11) {
        this.f116185j = i11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public C23995f m125648B(int i11) {
        this.f116190o = i11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public C23995f m125649C(Date date) {
        this.f116182g = date;
        return this;
    }

    /* renamed from: a */
    public void m125650a() {
        AbstractC29237l.m145996a(this.f116192q);
        this.f116192q = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m125651b(Closeable closeable) {
        this.f116192q = closeable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C23995f m125652c(int i11) {
        this.f116176a = i11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public C23995f m125653d(byte[] bArr) {
        this.f116180e = bArr;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C23995f m125654e() {
        this.f116184i = System.currentTimeMillis() - this.f116186k;
        this.f116187l = true;
        this.f116189n = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public C23995f m125655f(String str) {
        this.f116191p = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C23995f m125656g(File file) {
        this.f116181f = file;
        return this;
    }

    /* renamed from: h */
    public int m125657h() {
        return this.f116176a;
    }

    /* renamed from: i */
    public int m125658i() {
        return this.f116177b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public byte[] m125659j() {
        return this.f116180e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public boolean m125660k() {
        return this.f116187l;
    }

    /* renamed from: l */
    public long m125661l() {
        return this.f116184i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public File m125662m() {
        return this.f116181f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public boolean m125663n() {
        return this.f116188m;
    }

    /* renamed from: o */
    public String m125664o() {
        return this.f116178c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean m125665p() {
        return this.f116189n;
    }

    /* renamed from: q */
    public int m125666q() {
        return this.f116185j;
    }

    /* renamed from: r */
    public long m125667r() {
        return this.f116186k;
    }

    /* renamed from: s */
    public int m125668s() {
        return this.f116190o;
    }

    /* renamed from: t */
    public boolean m125669t() {
        return this.f116193r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public C23995f m125670u(String str) {
        this.f116178c = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public C23995f m125671v(String str) {
        this.f116179d = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public C23995f m125672w(boolean z11) {
        this.f116183h = z11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public C23995f m125673x() {
        this.f116184i = System.currentTimeMillis() - this.f116186k;
        this.f116187l = false;
        m125650a();
        return this;
    }

    /* renamed from: y */
    public C23995f m125674y(int i11) {
        this.f116177b = i11;
        return this;
    }

    /* renamed from: z */
    public void m125675z(boolean z11) {
        this.f116193r = z11;
    }
}
