--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-09-24 00:56:41 -05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE prueba;
--
-- TOC entry 3178 (class 1262 OID 41633)
-- Name: prueba; Type: DATABASE; Schema: -; Owner: usrprueba
--

CREATE DATABASE prueba WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';


ALTER DATABASE prueba OWNER TO usrprueba;

\connect prueba

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 207 (class 1259 OID 41684)
-- Name: ciudades; Type: TABLE; Schema: public; Owner: usrprueba
--

CREATE TABLE public.ciudades (
    id_ciu bigint NOT NULL,
    nombre_ciu character varying(255) NOT NULL,
    id_pai integer
);


ALTER TABLE public.ciudades OWNER TO usrprueba;

--
-- TOC entry 206 (class 1259 OID 41682)
-- Name: ciudades_id_ciu_seq; Type: SEQUENCE; Schema: public; Owner: usrprueba
--

CREATE SEQUENCE public.ciudades_id_ciu_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ciudades_id_ciu_seq OWNER TO usrprueba;

--
-- TOC entry 3179 (class 0 OID 0)
-- Dependencies: 206
-- Name: ciudades_id_ciu_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usrprueba
--

ALTER SEQUENCE public.ciudades_id_ciu_seq OWNED BY public.ciudades.id_ciu;


--
-- TOC entry 205 (class 1259 OID 41674)
-- Name: paises; Type: TABLE; Schema: public; Owner: usrprueba
--

CREATE TABLE public.paises (
    id_pai integer NOT NULL,
    nombre character varying(255) NOT NULL,
    abreviatura character(3)
);


ALTER TABLE public.paises OWNER TO usrprueba;

--
-- TOC entry 204 (class 1259 OID 41672)
-- Name: paises_id_seq; Type: SEQUENCE; Schema: public; Owner: usrprueba
--

CREATE SEQUENCE public.paises_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.paises_id_seq OWNER TO usrprueba;

--
-- TOC entry 3180 (class 0 OID 0)
-- Dependencies: 204
-- Name: paises_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usrprueba
--

ALTER SEQUENCE public.paises_id_seq OWNED BY public.paises.id_pai;


--
-- TOC entry 208 (class 1259 OID 41707)
-- Name: paisesciudades; Type: VIEW; Schema: public; Owner: usrcommi
--

CREATE VIEW public.paisesciudades AS
 SELECT ci.id_pai,
    pa.nombre AS nombrepai,
    ci.id_ciu,
    ci.nombre_ciu
   FROM (public.ciudades ci
     JOIN public.paises pa ON ((ci.id_pai = pa.id_pai)));


ALTER TABLE public.paisesciudades OWNER TO usrcommi;

--
-- TOC entry 203 (class 1259 OID 41637)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: usrprueba
--

CREATE TABLE public.usuarios (
    id_usu bigint NOT NULL,
    tipodocumento smallint NOT NULL,
    nombre1 character varying(60) NOT NULL,
    nombre2 character varying(60),
    apellido1 character varying(80) NOT NULL,
    apellido2 character varying(80),
    direccion character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    telefono character varying(100),
    documento integer NOT NULL,
    tienehijos boolean NOT NULL,
    id_ciu integer
);


ALTER TABLE public.usuarios OWNER TO usrprueba;

--
-- TOC entry 202 (class 1259 OID 41635)
-- Name: usuarios_id_seq; Type: SEQUENCE; Schema: public; Owner: usrprueba
--

CREATE SEQUENCE public.usuarios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuarios_id_seq OWNER TO usrprueba;

--
-- TOC entry 3181 (class 0 OID 0)
-- Dependencies: 202
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: usrprueba
--

ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id_usu;


--
-- TOC entry 3025 (class 2604 OID 41687)
-- Name: ciudades id_ciu; Type: DEFAULT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.ciudades ALTER COLUMN id_ciu SET DEFAULT nextval('public.ciudades_id_ciu_seq'::regclass);


--
-- TOC entry 3024 (class 2604 OID 41677)
-- Name: paises id_pai; Type: DEFAULT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.paises ALTER COLUMN id_pai SET DEFAULT nextval('public.paises_id_seq'::regclass);


--
-- TOC entry 3023 (class 2604 OID 41640)
-- Name: usuarios id_usu; Type: DEFAULT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id_usu SET DEFAULT nextval('public.usuarios_id_seq'::regclass);


--
-- TOC entry 3172 (class 0 OID 41684)
-- Dependencies: 207
-- Data for Name: ciudades; Type: TABLE DATA; Schema: public; Owner: usrprueba
--

INSERT INTO public.ciudades (id_ciu, nombre_ciu, id_pai) VALUES (2, 'Medellin', 1);


--
-- TOC entry 3170 (class 0 OID 41674)
-- Dependencies: 205
-- Data for Name: paises; Type: TABLE DATA; Schema: public; Owner: usrprueba
--

INSERT INTO public.paises (id_pai, nombre, abreviatura) VALUES (1, 'Colombia', 'COP');


--
-- TOC entry 3168 (class 0 OID 41637)
-- Dependencies: 203
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: usrprueba
--

INSERT INTO public.usuarios (id_usu, tipodocumento, nombre1, nombre2, apellido1, apellido2, direccion, email, telefono, documento, tienehijos, id_ciu) VALUES (10, 1, 'Andres', NULL, 'Castellanos', NULL, 'Calle 62', 'andresrobanesky@gmail.com', '3105056460', 1018411105, false, NULL);
INSERT INTO public.usuarios (id_usu, tipodocumento, nombre1, nombre2, apellido1, apellido2, direccion, email, telefono, documento, tienehijos, id_ciu) VALUES (6, 1, 'Andres', NULL, 'Castellanos', 'Pallares', 'Calle 62', 'andresrobanesky@gmail.com', '3105056460', 1018411104, false, NULL);
INSERT INTO public.usuarios (id_usu, tipodocumento, nombre1, nombre2, apellido1, apellido2, direccion, email, telefono, documento, tienehijos, id_ciu) VALUES (4, 1, 'Andres', NULL, 'Castellanos', 'Pallares', 'calle 62', 'andresrobanesky@gmail.com', '3105056460', 1014578954, false, NULL);


--
-- TOC entry 3182 (class 0 OID 0)
-- Dependencies: 206
-- Name: ciudades_id_ciu_seq; Type: SEQUENCE SET; Schema: public; Owner: usrprueba
--

SELECT pg_catalog.setval('public.ciudades_id_ciu_seq', 2, true);


--
-- TOC entry 3183 (class 0 OID 0)
-- Dependencies: 204
-- Name: paises_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usrprueba
--

SELECT pg_catalog.setval('public.paises_id_seq', 1, true);


--
-- TOC entry 3184 (class 0 OID 0)
-- Dependencies: 202
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: usrprueba
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 10, true);


--
-- TOC entry 3036 (class 2606 OID 41689)
-- Name: ciudades ciudades_pkey; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.ciudades
    ADD CONSTRAINT ciudades_pkey PRIMARY KEY (id_ciu);


--
-- TOC entry 3032 (class 2606 OID 41681)
-- Name: paises nombre_uk; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.paises
    ADD CONSTRAINT nombre_uk UNIQUE (nombre);


--
-- TOC entry 3034 (class 2606 OID 41679)
-- Name: paises paises_pkey; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.paises
    ADD CONSTRAINT paises_pkey PRIMARY KEY (id_pai);


--
-- TOC entry 3028 (class 2606 OID 41645)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id_usu);


--
-- TOC entry 3030 (class 2606 OID 41647)
-- Name: usuarios usuarios_tipdoc_uk; Type: CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_tipdoc_uk UNIQUE (tipodocumento, documento);


--
-- TOC entry 3037 (class 1259 OID 41706)
-- Name: fki_ciudades_paises_fk; Type: INDEX; Schema: public; Owner: usrprueba
--

CREATE INDEX fki_ciudades_paises_fk ON public.ciudades USING btree (id_pai);


--
-- TOC entry 3026 (class 1259 OID 41700)
-- Name: fki_usuarios_ciudades_fk; Type: INDEX; Schema: public; Owner: usrprueba
--

CREATE INDEX fki_usuarios_ciudades_fk ON public.usuarios USING btree (id_ciu);


--
-- TOC entry 3039 (class 2606 OID 41701)
-- Name: ciudades ciudades_paises_fk; Type: FK CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.ciudades
    ADD CONSTRAINT ciudades_paises_fk FOREIGN KEY (id_pai) REFERENCES public.paises(id_pai) NOT VALID;


--
-- TOC entry 3038 (class 2606 OID 41695)
-- Name: usuarios usuarios_ciudades_fk; Type: FK CONSTRAINT; Schema: public; Owner: usrprueba
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_ciudades_fk FOREIGN KEY (id_ciu) REFERENCES public.ciudades(id_ciu) NOT VALID;


-- Completed on 2020-09-24 00:56:42 -05

--
-- PostgreSQL database dump complete
--

