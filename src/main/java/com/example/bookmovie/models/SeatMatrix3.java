package com.example.bookmovie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "SeatMatrix3")
public class SeatMatrix3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer S_No;
    @Column(name = "A")
    private Integer A;
    @Column(name = "B")
    private Integer B;
    @Column(name = "C")
    private Integer C;
    @Column(name = "D")
    private Integer D;
    @Column(name = "E")
    private Integer E;
    @Column(name = "F")
    private Integer F;
    @Column(name = "G")
    private Integer G;
    @Column(name = "H")
    private Integer H;
    @Column(name = "I")
    private Integer I;
    @Column(name = "J")
    private Integer J;
    @Column(name = "K")
    private Integer K;
    @Column(name = "L")
    private Integer L;
    @Column(name = "M")
    private Integer M;
    @Column(name = "N")
    private Integer N;
    @Column(name = "O")
    private Integer O;
    @Column(name = "P")
    private Integer P;
    @Column(name = "Q")
    private Integer Q;
    @Column(name = "R")
    private Integer R;
    @Column(name = "S")
    private Integer S;
    @Column(name = "T")
    private Integer T;
    @Column(name = "U")
    private Integer U;
    @Column(name = "V")
    private Integer V;
    @Column(name = "W")
    private Integer W;

    @Override
    public String toString() {
        return "SeatMatrix3 [S_No=" + S_No + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", F=" + F
                + ", G=" + G + ", H=" + H + ", I=" + I + ", J=" + J + ", K=" + K + ", L=" + L + ", M=" + M + ", N=" + N
                + ", O=" + O + ", P=" + P + ", Q=" + Q + ", R=" + R + ", S=" + S + ", T=" + T + ", U=" + U + ", V=" + V
                + ", W=" + W + ", X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
    }

    @Column(name = "X")
    private Integer X;
    @Column(name = "Y")
    private Integer Y;

    public SeatMatrix3(Integer s_No, Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g,
            Integer h, Integer i, Integer j, Integer k, Integer l, Integer m, Integer n, Integer o, Integer p,
            Integer q, Integer r, Integer s, Integer t, Integer u, Integer v, Integer w, Integer x, Integer y,
            Integer z) {
        S_No = s_No;
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        G = g;
        H = h;
        I = i;
        J = j;
        K = k;
        L = l;
        M = m;
        N = n;
        O = o;
        P = p;
        Q = q;
        R = r;
        S = s;
        T = t;
        U = u;
        V = v;
        W = w;
        X = x;
        Y = y;
        Z = z;
    }

    @Column(name = "Z")
    private Integer Z;

    public SeatMatrix3() {
    }

    public Integer getS_No() {
        return S_No;
    }

    public void setS_No(Integer s_No) {
        S_No = s_No;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    public Integer getC() {
        return C;
    }

    public void setC(Integer c) {
        C = c;
    }

    public Integer getD() {
        return D;
    }

    public void setD(Integer d) {
        D = d;
    }

    public Integer getE() {
        return E;
    }

    public void setE(Integer e) {
        E = e;
    }

    public Integer getF() {
        return F;
    }

    public void setF(Integer f) {
        F = f;
    }

    public Integer getG() {
        return G;
    }

    public void setG(Integer g) {
        G = g;
    }

    public Integer getH() {
        return H;
    }

    public void setH(Integer h) {
        H = h;
    }

    public Integer getI() {
        return I;
    }

    public void setI(Integer i) {
        I = i;
    }

    public Integer getJ() {
        return J;
    }

    public void setJ(Integer j) {
        J = j;
    }

    public Integer getK() {
        return K;
    }

    public void setK(Integer k) {
        K = k;
    }

    public Integer getL() {
        return L;
    }

    public void setL(Integer l) {
        L = l;
    }

    public Integer getM() {
        return M;
    }

    public void setM(Integer m) {
        M = m;
    }

    public Integer getN() {
        return N;
    }

    public void setN(Integer n) {
        N = n;
    }

    public Integer getO() {
        return O;
    }

    public void setO(Integer o) {
        O = o;
    }

    public Integer getP() {
        return P;
    }

    public void setP(Integer p) {
        P = p;
    }

    public Integer getQ() {
        return Q;
    }

    public void setQ(Integer q) {
        Q = q;
    }

    public Integer getR() {
        return R;
    }

    public void setR(Integer r) {
        R = r;
    }

    public Integer getS() {
        return S;
    }

    public void setS(Integer s) {
        S = s;
    }

    public Integer getT() {
        return T;
    }

    public void setT(Integer t) {
        T = t;
    }

    public Integer getU() {
        return U;
    }

    public void setU(Integer u) {
        U = u;
    }

    public Integer getV() {
        return V;
    }

    public void setV(Integer v) {
        V = v;
    }

    public Integer getW() {
        return W;
    }

    public void setW(Integer w) {
        W = w;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getZ() {
        return Z;
    }

    public void setZ(Integer z) {
        Z = z;
    }

}
